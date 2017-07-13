package ro.teamnet.zth.api.em;

import com.sun.java.util.jar.pack.Package;
import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexandra.Mihalcea on 7/12/2017.
 */
public class EntityUtils {
    private EntityUtils() {
        throw new UnsupportedOperationException();
    }
    public static String getTableName(Class entity){
        if(entity.isAnnotationPresent(Table.class))
            return ((Table)entity.getAnnotation(Table.class)).name();
        else
            return entity.getName();
    }
    public static List<ColumnInfo> getColumns(Class entity){
        List<ColumnInfo> myList = new ArrayList<ColumnInfo>();
        for (Field index: entity.getFields()){
            if(index.isAnnotationPresent(Column.class) || index.isAnnotationPresent(Id.class)) {
                ColumnInfo column = new ColumnInfo();
                column.setDbColumnName(((Column)entity.getAnnotation(Column.class)).name());
                column.setColumnName(index.getName());
                column.setColumnType(index.getType());
                if(index.isAnnotationPresent(Id.class)){
                    column.setId(true);
                }
                else{
                    column.setId(false);
                }
                myList.add(column);
            }
        }
        return myList;
    }
    public static Object castFromSqlType(Object value, Class wantedType){
        if( value instanceof BigDecimal){
            return wantedType.cast(value);
        }
        else{
            return value;
        }

    }
    public static List<Field> getFieldsByAnnotations(Class clazz, Class annotation){
        List<Field> AnotherList = new ArrayList<Field>();
        for(Field i:clazz.getFields())
            if(i.isAnnotationPresent(annotation))
                AnotherList.add(i);
        return AnotherList;

    }
    public static Object getSqlValue(Object object) throws NoSuchFieldException {
        if(object.getClass().isAnnotationPresent(Table.class)){
            object.getClass().getField(object.getClass().getAnnotation(Id.class).name()).setAccessible(true);
        }
    }
}
