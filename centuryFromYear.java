int centuryFromYear(int year) {
    int century = 0; 
    int temp = year % 100; 
    if(temp == 0){
        century = year / 100; 
    }else{
        century = (year / 100)+1; 
    }
    return century; 

}
