package GRADS.src.GRADSResources;

public class BuildingFile<T> {

    private String[] data;


    public BuildingFile(String[] data){
        this.data = data;
    }

    public String[] getData(){
        return this.data;
    }

    public void setData(String[] data){
        this.data = data;
    }

}
