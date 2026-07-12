class Darts {
    int score(double xOfDart, double yOfDart) {
        // x^2 + y^2 = r^2
        // the above eq is used to check if point is inside, outside or on the circle

        double eq = (xOfDart * xOfDart) + (yOfDart * yOfDart);

        if(eq <= 1){
            return 10;
        }
        else if(eq <= 25){
            return 5;
        }
        else if(eq <= 100){
            return 1;
        }
        
        return 0;
    }
}
