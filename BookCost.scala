object BookCost extends App{
  def TotCost(n:Double):Double={
    var T :Double=0.0;

    if(n>50){
      T = (24.95*0.6)*n + 150.0 + 0.75*(n-50);
      return T;
    }
    else
    {
      T = ((24.95*0.6)+ 3.0)*n;
      return T;
    }
  }
  println("Total Cost for 60 books is: "+TotCost(60));
}
