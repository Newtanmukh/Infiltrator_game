import java.lang.Math;


public class Infiltrator {

   
    int x;
    int y;
  double probabilityofmoving;
   int time=0;
 


    Infiltrator(double k)
    {this.x=0;
    this.y=0;
    this.probabilityofmoving=k;
    }

    public void movenext()
    {if(Math.random()<this.probabilityofmoving)
        {
        this.y=this.y+1;
        this.time+=10;
    }
        else if(Math.random()<this.probabilityofmoving)
        {
            this.x=this.x+1;
        this.y=this.y-1;
        this.time+=10;
    }
    else if(Math.random()<this.probabilityofmoving)
        {
            this.x=this.x+1;
        
        this.time+=10;
    }
    else if(Math.random()<this.probabilityofmoving)
        {
            this.x=this.x+1;
            this.y=this.y+1;
        this.time+=10;
    }
    else if(Math.random()<this.probabilityofmoving)
        {
            
            this.y=this.y+1;
        this.time+=10;
    }
    else
    {this.time+=10;}
    }
    
    
}

