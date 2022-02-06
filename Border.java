public class Border {
    int length;
    double probabilityofheads;
   int column_number=0;
    Border(int l,double probability)
    {
        this.length=l;
        this.probabilityofheads=probability;

        Sensor[] sensors=new Sensor[this.length];

        for(int i=0;i<this.length;i+=1)
        {
            sensors[i] = new Sensor(true);
            sensors[i].on=false;}
    
          }

        }


       

     
        


  


