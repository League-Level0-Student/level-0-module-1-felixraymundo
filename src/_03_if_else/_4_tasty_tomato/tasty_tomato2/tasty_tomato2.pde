void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#FF0307);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#02C91A);
    rect(176, 103, 12, 32);
    if(mousePressed){
    fill(#C6C4C4);
    ellipse(80, 200, 30, 30);
    }
}
