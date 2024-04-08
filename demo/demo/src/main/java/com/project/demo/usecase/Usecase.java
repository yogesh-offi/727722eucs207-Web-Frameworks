package com.project.demo.usecase;

public class Usecase {
    String name,regno,course,hobbies,favfood,funnyExp,aim,shortTermGoal,longTermGoal,Advice;

    public String getName() {
        return name;
    }

    public Usecase(String name, String regno, String course, String hobbies, String favfood, String funnyExp,
            String aim, String shortTermGoal, String longTermGoal, String advice) {
        this.name = name;
        this.regno = regno;
        this.course = course;
        this.hobbies = hobbies;
        this.favfood = favfood;
        this.funnyExp = funnyExp;
        this.aim = aim;
        this.shortTermGoal = shortTermGoal;
        this.longTermGoal = longTermGoal;
        Advice = advice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getFavfood() {
        return favfood;
    }

    public void setFavfood(String favfood) {
        this.favfood = favfood;
    }

    public String getFunnyExp() {
        return funnyExp;
    }

    public void setFunnyExp(String funnyExp) {
        this.funnyExp = funnyExp;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getShortTermGoal() {
        return shortTermGoal;
    }

    public void setShortTermGoal(String shortTermGoal) {
        this.shortTermGoal = shortTermGoal;
    }

    public String getLongTermGoal() {
        return longTermGoal;
    }

    public void setLongTermGoal(String longTermGoal) {
        this.longTermGoal = longTermGoal;
    }

    public String getAdvice() {
        return Advice;
    }

    public void setAdvice(String advice) {
        Advice = advice;
    }
    
}
