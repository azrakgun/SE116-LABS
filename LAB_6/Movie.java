public class Movie extends Content {
   private boolean hasPostCreditScene;

   public Movie(String id,String title,int baseDuration, boolean hasPostCreditScene){
        super(id,title,baseDuration);
        this.hasPostCreditScene=hasPostCreditScene;

   }
  public boolean isHasPostCreditScene(){
       return hasPostCreditScene;
  }
  @Override
    public int calculateTotalDuration(){
       if(hasPostCreditScene)
      return getBaseDuration() + 5 ;
       return getBaseDuration();
  }

    @Override
  public String getRecommendationCategory(){
       if(getBaseDuration()<90){
           return "Short Watch";
       }else{
           return "Feature Length";
       }
  }
}
