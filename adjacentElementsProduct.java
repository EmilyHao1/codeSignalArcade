int adjacentElementsProduct(int[] inputArray) {
    int result = 0; 
    int tempProduct = -111111;

    for (int i=0; i< inputArray.length-1; i++){
        
        int product = inputArray[i] * inputArray[i+1];
        if(tempProduct <product){

            tempProduct = product; 
        }
    }
    return tempProduct;

}
