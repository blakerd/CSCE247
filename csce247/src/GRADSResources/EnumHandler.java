package csce247.src.GRADSResources;

public class EnumHandler {

    public enum GradeEnum{
        A,
        B,
        C,
        D,
        F,
        P,
        taking,
        DEFAULT;
    }

    public enum UserEnum{

        STUDENT,
        GRADUATE_PROGRAM_COORDINATOR,
        DEFAULT;
    }

    public enum SemesterEnum{

        FALL,
        SPRING,
        SUMMER,
        DEFAULT;
    }

    public enum DeptMajorEnum{
        COMPUTER_SCIENCE,
        COMPUTER_INFORMATION_SYSTEMS,
        COMPUTER_ENGINEERING,
        DEFAULT;
    }


    public static GradeEnum convertToGradeEnum(char Grade) {

        String grade = Grade + "";
        grade = grade.toUpperCase();
        Grade = grade.charAt(0);
        for (GradeEnum g : GradeEnum.values()) {
            if(Grade == g.toString().charAt(0)){
                return g;
            }
        }
        System.out.println("Error!");
        return null;

    }

    public static UserEnum convertToUserEnum(String User){

        for (UserEnum e : UserEnum.values()){
            if(User.equalsIgnoreCase(e.toString())){
                return e;
            }
        }
        System.out.println("Error!");
        return null;
    }

    public static SemesterEnum convertToSemesterEnum(String semester){

        for (SemesterEnum s : SemesterEnum.values()){
            if(semester.equalsIgnoreCase(s.toString())) {
                return s;
            }
        }
        System.out.println("Error!");
        return null;
    }

    public static DeptMajorEnum convertToDeptMajorEnum(String deptMajor){

        for (DeptMajorEnum dm : DeptMajorEnum.values()){
            if(deptMajor.equalsIgnoreCase(dm.toString())) {
                return dm;
            }
        }
        System.out.println("Error!");
        return null;
    }



}
