package com.example.tablayoutwithfregment;

public class MyData {
        private String Name;
        private Integer image;
        private String color;

        public MyData(String name, Integer image, String color) {
            Name = name;
            this.image = image;
            this.color = color;
        }

        public String getName() {
            return Name;
        }

        public Integer getImage() {
            return image;
        }

        public String getColor() {
            return color;
        }
    }


