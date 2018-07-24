int Solution::numSetBits(unsigned int A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    
    int count= 0;
    int res;
    while(A != 0)
    {
        res = (A) & 1;   
        
       // cout << res <<" ";
        if(res == 1)
            count++;
            
        A= A >> 1;
        
        
    }
    
    return count;
}