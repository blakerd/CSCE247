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

  public GradeEnum convertToGrade(char Grade){

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
    }


  }

}
