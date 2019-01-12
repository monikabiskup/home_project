package scheme;

import java.util.Objects;

public class Employee {

        private Long id;
        private String employeeName;
        private String employeeSurname;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeSurname() {
            return employeeSurname;
        }

        public void setEmployeeSurname(String employeeSurname) {
            this.employeeSurname = employeeSurname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(employeeName, employee.employeeName) &&
                    Objects.equals(employeeSurname, employee.employeeSurname);
        }

        @Override
        public int hashCode() {

            return Objects.hash(employeeName, employeeSurname);
        }

        @Override
        public String toString() {

            return id + ","
                    + employeeName + ","
                    + employeeSurname;
    }
}