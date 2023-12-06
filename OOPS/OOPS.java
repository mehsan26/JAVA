public class OOPS {
    public static void main(String args[]) {
        // Pen in= new Pen();
        // in.setColor("blue");
        // in.setType("GelPen");
        // in.setTip(5);
        // System.out.println(in.getColor());
        // System.out.println(in.type);
        // System.out.println(in.tip);

        // Bankaccount on=new Bankaccount();
        // on.setUsername("mehsan");
        // on.setPassword("qzwsedrf");
        // System.out.println(on.getUsername());
        // System.out.println(on.getPassword());

    }
}
// // basic class and object and geter and seters
// class Pen {
//     private String color;
//     String type;
//     int tip;

//     void setColor(String newColor) {
//         color =newColor;
//     }
//     void setType(String newType) {
//         type = newType;
//     }
//     void setTip(int newTip) {
//         tip = newTip;
//     }
//     String getColor() {
//         return color;
//     }
// }

// // this keyword and gters and seters and attributes and function of a object in a class
// class Bankaccount {
//     String username;
//     private String password;

//     void setUsername(String username) {
//         this.username=username;
//     }
//     void setPassword(String password) {
//         this.password=password;
//     }
//     String getPassword() {
//         return password;
//     }
//     String getUsername() {
//         return username;
//     }
// }

//encaosulation mean wrapping up of data and methods under a single unit. It also implement data hiding using access specifiers.
// their are 4 access specifiers in java
// 1. private : within class only
// 2. default : within class, within packeges
// 3. protected : within class, within packeges, within subclass
// 4. public : within class, within packeges, within subclass, outside of the class

// constructor : constructor is a block of code that initializes(constructs) the state and value during object creation.
// 1: constructor has same name as class name.
// 2: constructor has no return types like function.
// 3: Constructor is called at the time of object is created with the help of new keywords.
// 4: Memory allocation happend when a Constructor is called.

class Student {
    String name;
    int rollNo;
    
}

