package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

/**
 * Created by Alexandra.Mihalcea on 7/12/2017.
 */
@Table(name = "departments")
public class Department {
    @Id(name = "department_id")
        private Long id;
    @Column(name = "department_name")
        private String departmentName;
    @Column(name = "location_id")
        private Location locationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Location getLocation() {
        return locationId;
    }

    public void setLocation(Location locationId) {
        this.locationId = locationId;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
