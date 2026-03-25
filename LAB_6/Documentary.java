public class Documentary extends Content {
         private int researchDepthLevel;
         private int numberOfScientistInterviews;
public Documentary(String id,String title,int baseDuration,int numberOfScientistInterviews,int researchDepthLevel){
    super(id,title,baseDuration);
                 this.researchDepthLevel=researchDepthLevel;
                 this.numberOfScientistInterviews=numberOfScientistInterviews;
             }
             public int calculateTotalDuration(){
                return getBaseDuration() +(numberOfScientistInterviews) *10;
             }
             public String getRecommendationCategory(){
    if(researchDepthLevel >=4){
        return "In-Depth";

                }
    else{
        return "Light Informative ";
    }

             }
     }


