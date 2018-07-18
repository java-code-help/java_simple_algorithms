int maxMultiple(int divisor, int bound) {
    int n = bound%divisor;
    return bound-n;
}
