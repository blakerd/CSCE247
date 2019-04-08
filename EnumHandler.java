public class EnumHandler{

  public enum GradeEnum{

    A,
    B,
    C,
    D,
    F,
    P,
    _;
  }

  public enum UserEnum{

    STUDENT,
    GRADUATE_PROGRAM_COORDINATOR;
  }

  public enum SemesterEnum{
    
    FALL,
    SPRING,
    SUMMER;
  }

  public static GradeEnum convertToGradeEnum(char Grade){

    switch(Grade){
      case (Grade.toString() == GradeEnum.A.toString()):
        return GradeEnum.A;
        break;
      case (Grade.toString() == GradeEnum.B.toString()):
        break;
      case (Grade.toString() == GradeEnum.C.toString()):
        break;
      case (Grade.toString() == GradeEnum.D.toString()):
        break;
      case (Grade.toString() == GradeEnum.F.toString()):
        break;
      case (Grade.toString() == GradeEnum.P.toString()):
        break;
      case (Grade.toString() == GradeEnum._.toString()):
        break;
        default:
          return null;
    }

    public static UserEnum convertToUserEnum(String User){

      switch(User){
        case User.equalsIgnoreCase(UserEnum.GRADUATE_PROGRAM_COORDINATOR.toString()):
          return UserEnum.GRADUATE_PROGRAM_COORDINATOR;
          break;
        case User.equalsIgnoreCase(UserEnum.STUDENT.toString()):
          return UserEnum.STUDENT;
          break;
          default:
            return null;
      }
    }

    public static UserEnum convertToSemesterEnum(String Semester){

      switch(Semester){
        case Semester.equalsIgnoreCase(SemesterEnum.FALL.toString()):
          return SemesterEnum.FALL;
          break;
        case Semester.equalsIgnoreCase(SemesterEnum.SPRING.toString()):
          return SemesterEnum.SPRING;
          break;
        case Semester.equalsIgnoreCase(SemesterEnum.SUMMER.toString()):
          return SemesterEnum.SUMMER;
          break;
          default:
            return null;
      }
    }

}
