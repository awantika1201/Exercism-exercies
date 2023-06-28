class PrimeCalculator {

    int nth(int nth) {
        if(nth<=0){
            throw new IllegalArgumentException();
        }
        int count=0;
        for(int i=2; i<200000; i++){
            if(isPrime(i)){
               count++;
            }
            if(count==nth){
                return i;
            }
        }
        return -1;
    }

    private boolean isPrime(int num) {

        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
