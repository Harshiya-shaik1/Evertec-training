package org.example;

public class Department {



        private String departmentId;
        private String departmentName;
        public Department(String departmentId, String departmentName) {
            super();
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }
        public Department() {
            super();
            // TODO Auto-generated constructor stub
        }

        /**
         * @return the departmentName
         */
        public String getDepartmentName() {
            return departmentName;
        }
        /**
         * @param departmentName the departmentName to set
         */
        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }
        /**
         * @return the departmentId
         */
        public String getDepartmentId() {
            return departmentId;
        }
        /**
         * @param departmentId the departmentId to set
         */
        public void setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
        }
        @Override
        public String toString() {
            return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
        }



    }


