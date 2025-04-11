package java_adv2.annotation.basic;

@AnnoMeta
public class MetaData {

  //  @AnnoMeta //- 컴파일 오류
  private String id;

  @AnnoMeta
  public void call() {
  }

  public static void main(String[] args) throws NoSuchMethodException {
    AnnoMeta typeAnno = MetaData.class.getAnnotation(AnnoMeta.class);
    System.out.println("typeAnno = " + typeAnno);

    AnnoMeta call = MetaData.class.getMethod("call").getAnnotation(AnnoMeta.class);
    System.out.println("methodAnno = " + call);
  }
}
