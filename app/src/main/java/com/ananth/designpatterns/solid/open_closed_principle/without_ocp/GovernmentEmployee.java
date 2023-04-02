package com.ananth.designpatterns.solid.open_closed_principle.without_ocp;

import java.util.Random;

//name, id, mobile and address duplicated like BankEmployee, SoftwareEmployee
//saveEmpDetail duplicated
public class GovernmentEmployee {
        private String name;
        private String id;
        private String mobile;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        int generateGovernmentEmpId(){
            return new Random().nextInt();
        }

        private void saveEmpDetail(){
            //save code goes here
        }
}
