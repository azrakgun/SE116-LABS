public abstract class Content {
    private String id;
    private String title;
    private int baseDuration;

    public Content(String id,String title,int baseDuration){
       this.id=id;
       this.title=title;
       this.baseDuration=baseDuration;


    }
    public void setId(String id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setBaseDuration(int baseDuration){
        this.baseDuration=baseDuration;
    }
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int getBaseDuration(){
        return baseDuration;
    }

    public void displayInfo(){
        System.out.println("Content ID: " + id + "Title: " + title + "Base duration: " + baseDuration);
    }

    public abstract int calculateTotalDuration();
    public abstract String getRecommendationCategory();
    }


