package mx.edu.ittepic.u3e6_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class Lienzo1 extends View {
    Image logo,p1c0,p2c0,p3c0,p4c0,p1c1,p2c1,p3c1,p4c1,p1c2,p2c2,p3c2,p4c2,p1c3,p2c3,p3c3,p4c3;
    Image p1c0d,p2c0d,p3c0d,p4c0d,p1c1d,p2c1d,p3c1d,p4c1d,p1c2d,p2c2d,p3c2d,p4c2d,p1c3d,p2c3d,p3c3d,p4c3d;
    Main2Activity puntero;
    public Lienzo1 (Context context){
        super(context);
        puntero = (Main2Activity) context;
        logo = new Image(R.drawable.logo,75,75,20,20,true,null,this);
        switch (puntero.cat){
            case "cat0":
                p1c0 = new Image(R.drawable.p1c0,250,250,10,150,true,null,this);
                p2c0 = new Image(R.drawable.p2c0,250,250,10,420,true,null,this);
                p3c0 = new Image(R.drawable.p3c0,250,250,10,690,true,null,this);
                p4c0 = new Image(R.drawable.p4c0,250,250,10,960,true,null,this);
                p1c0 = new Image(R.drawable.p1c0,250,250,10,150,true,null,this);

                p1c0d = new Image(R.drawable.p1c0d,420,963,280,150,false,null,this);
                p2c0d = new Image(R.drawable.p2c0d,420,963,280,150,false,null,this);
                p3c0d = new Image(R.drawable.p3c0d,420,963,280,150,false,null,this);
                p4c0d = new Image(R.drawable.p4c0d,420,963,280,150,false,null,this);
                break;
            case "cat1":
                p1c1 = new Image(R.drawable.p1c1,250,250,10,150,true,null,this);
                p2c1 = new Image(R.drawable.p2c1,250,250,10,420,true,null,this);
                p3c1 = new Image(R.drawable.p3c1,250,250,10,690,true,null,this);
                p4c1 = new Image(R.drawable.p4c1,250,250,10,960,true,null,this);
                p1c1 = new Image(R.drawable.p1c1,250,250,10,150,true,null,this);

                p1c1d = new Image(R.drawable.p1c1d,420,963,280,150,false,null,this);
                p2c1d = new Image(R.drawable.p2c1d,420,963,280,150,false,null,this);
                p3c1d = new Image(R.drawable.p3c1d,420,963,280,150,false,null,this);
                p4c1d = new Image(R.drawable.p4c1d,420,963,280,150,false,null,this);
                break;
            case "cat2":
                p1c2 = new Image(R.drawable.p1c2,250,250,10,150,true,null,this);
                p2c2 = new Image(R.drawable.p2c2,250,250,10,420,true,null,this);
                p3c2 = new Image(R.drawable.p3c2,250,250,10,690,true,null,this);
                p4c2 = new Image(R.drawable.p4c2,250,250,10,960,true,null,this);
                p1c2 = new Image(R.drawable.p1c2,250,250,10,150,true,null,this);

                p1c2d = new Image(R.drawable.p1c2d,420,963,280,150,false,null,this);
                p2c2d = new Image(R.drawable.p2c2d,420,963,280,150,false,null,this);
                p3c2d = new Image(R.drawable.p3c2d,420,963,280,150,false,null,this);
                p4c2d = new Image(R.drawable.p4c2d,420,963,280,150,false,null,this);
                break;
            case "cat3":
                p1c3 = new Image(R.drawable.p1c3,250,250,10,150,true,null,this);
                p2c3 = new Image(R.drawable.p2c3,250,250,10,420,true,null,this);
                p3c3 = new Image(R.drawable.p3c3,250,250,10,690,true,null,this);
                p4c3 = new Image(R.drawable.p4c3,250,250,10,960,true,null,this);
                p1c3 = new Image(R.drawable.p1c3,250,250,10,150,true,null,this);

                p1c3d = new Image(R.drawable.p1c3d,420,963,280,150,false,null,this);
                p2c3d = new Image(R.drawable.p2c3d,420,963,280,150,false,null,this);
                p3c3d = new Image(R.drawable.p3c3d,420,963,280,150,false,null,this);
                p4c3d = new Image(R.drawable.p4c3d,420,963,280,150,false,null,this);
                break;
        }
    }
    @Override
    public void onDraw(Canvas c){
        Paint p = new Paint();
        logo.pintar( c,p );
        p.setTextSize(35);
        p.setColor( Color.parseColor("#01a0ca"));
        c.drawText( "okians",85,65,p);
        c.drawText("cat"+ puntero.cat,10,120,p);
        switch (puntero.cat){
            case "cat0":
                p1c0.pintar(c,p);
                p1c0.texto( c,p,"Nokia 3310",25,Color.parseColor("#3f48cc"),"debajo");
                p2c0.pintar(c,p);
                p2c0.texto( c,p,"Nokia 8810",25,Color.parseColor("#3f48cc"),"debajo");
                p3c0.pintar(c,p);
                p3c0.texto( c,p,"Nokia 206",25,Color.parseColor("#3f48cc"),"debajo");
                p4c0.pintar(c,p);
                p4c0.texto( c,p,"Nokia 105",25,Color.parseColor("#3f48cc"),"debajo");
                p1c0d.pintar(c,p);
                p2c0d.pintar(c,p);
                p3c0d.pintar(c,p);
                p4c0d.pintar(c,p);
                break;
            case "cat1":
                p1c1.pintar(c,p);
                p1c1.texto( c,p,"Nokia 2",25,Color.parseColor("#3f48cc"),"debajo");
                p2c1.pintar(c,p);
                p2c1.texto( c,p,"Nokia 2.1",25,Color.parseColor("#3f48cc"),"debajo");
                p3c1.pintar(c,p);
                p3c1.texto( c,p,"Nokia 3",25,Color.parseColor("#3f48cc"),"debajo");
                p4c1.pintar(c,p);
                p4c1.texto( c,p,"Nokia 3.1",25,Color.parseColor("#3f48cc"),"debajo");
                p1c1d.pintar(c,p);
                p2c1d.pintar(c,p);
                p3c1d.pintar(c,p);
                p4c1d.pintar(c,p);
                break;
            case "cat2":
                p1c2.pintar(c,p);
                p1c2.texto( c,p,"Nokia 5",25,Color.parseColor("#3f48cc"),"debajo");
                p2c2.pintar(c,p);
                p2c2.texto( c,p,"Nokia 5.1",25,Color.parseColor("#3f48cc"),"debajo");
                p3c2.pintar(c,p);
                p3c2.texto( c,p,"Nokia 6.1",25,Color.parseColor("#3f48cc"),"debajo");
                p4c2.pintar(c,p);
                p4c2.texto( c,p,"Nokia 6.1 plus",25,Color.parseColor("#3f48cc"),"debajo");
                p1c2d.pintar(c,p);
                p2c2d.pintar(c,p);
                p3c2d.pintar(c,p);
                p4c2d.pintar(c,p);
                break;
            case "cat3":
                p1c3.pintar(c,p);
                p1c3.texto( c,p,"Nokia 7",25,Color.parseColor("#3f48cc"),"debajo");
                p2c3.pintar(c,p);
                p2c3.texto( c,p,"Nokia 7.1",25,Color.parseColor("#3f48cc"),"debajo");
                p3c3.pintar(c,p);
                p3c3.texto( c,p,"Nokia 8",25,Color.parseColor("#3f48cc"),"debajo");
                p4c3.pintar(c,p);
                p4c3.texto( c,p,"Nokia 8 Sirocco",25,Color.parseColor("#3f48cc"),"debajo");
                p1c3d.pintar(c,p);
                p2c3d.pintar(c,p);
                p3c3d.pintar(c,p);
                p4c3d.pintar(c,p);
                break;
        }

    }
    public boolean onTouchEvent(MotionEvent e){
        float px=e.getX();
        float py=e.getY();

        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
                switch (puntero.cat){
                    case "cat0":
                        if (p1c0.enArea(px, py)) {
                            p1c0d.visible(true);
                            p2c0d.visible( false );
                            p3c0d.visible( false );
                            p4c0d.visible( false );
                        }
                        if (p2c0.enArea(px, py)) {
                            p2c0d.visible(true);
                            p1c0d.visible( false );
                            p3c0d.visible( false );
                            p4c0d.visible( false );
                        }
                        if (p3c0.enArea(px, py)) {
                            p3c0d.visible(true);
                            p1c0d.visible( false );
                            p2c0d.visible( false );
                            p4c0d.visible( false );
                        }
                        if (p4c0.enArea(px, py)) {
                            p4c0d.visible(true);
                            p1c0d.visible( false );
                            p2c0d.visible( false );
                            p3c0d.visible( false );
                        }
                        break;
                    case "cat1":
                        if (p1c1.enArea(px, py)) {
                            p1c1d.visible(true);
                            p2c1d.visible( false );
                            p3c1d.visible( false );
                            p4c1d.visible( false );
                        }
                        if (p2c1.enArea(px, py)) {
                            p2c1d.visible(true);
                            p1c1d.visible( false );
                            p3c1d.visible( false );
                            p4c1d.visible( false );
                        }
                        if (p3c1.enArea(px, py)) {
                            p3c1d.visible(true);
                            p1c1d.visible( false );
                            p2c1d.visible( false );
                            p4c1d.visible( false );
                        }
                        if (p4c1.enArea(px, py)) {
                            p4c1d.visible(true);
                            p1c1d.visible( false );
                            p2c1d.visible( false );
                            p3c1d.visible( false );
                        }
                        break;
                    case "cat2":
                        if (p1c2.enArea(px, py)) {
                            p1c2d.visible(true);
                            p2c2d.visible( false );
                            p3c2d.visible( false );
                            p4c2d.visible( false );
                        }
                        if (p2c2.enArea(px, py)) {
                            p2c2d.visible(true);
                            p1c2d.visible( false );
                            p3c2d.visible( false );
                            p4c2d.visible( false );
                        }
                        if (p3c2.enArea(px, py)) {
                            p3c2d.visible(true);
                            p1c2d.visible( false );
                            p2c2d.visible( false );
                            p4c2d.visible( false );
                        }
                        if (p4c2.enArea(px, py)) {
                            p4c2d.visible(true);
                            p1c2d.visible( false );
                            p2c2d.visible( false );
                            p3c2d.visible( false );
                        }
                        break;
                    case "cat3":
                        if (p1c3.enArea(px, py)) {
                            p1c3d.visible(true);
                            p2c3d.visible( false );
                            p3c3d.visible( false );
                            p4c3d.visible( false );
                        }
                        if (p2c3.enArea(px, py)) {
                            p2c3d.visible(true);
                            p1c3d.visible( false );
                            p3c3d.visible( false );
                            p4c3d.visible( false );
                        }
                        if (p3c3.enArea(px, py)) {
                            p3c3d.visible(true);
                            p1c3d.visible( false );
                            p2c3d.visible( false );
                            p4c3d.visible( false );
                        }
                        if (p4c3.enArea(px, py)) {
                            p4c3d.visible(true);
                            p1c3d.visible( false );
                            p2c3d.visible( false );
                            p3c3d.visible( false );
                        }
                        break;
                }
            case MotionEvent.ACTION_MOVE:
                switch (puntero.cat){
                    case "cat0":
                        if (p1c0.enArea(px,py)){
                            p1c0.moverY(py);
                            p2c0.moverY(p1c0.getY()+400);
                            p3c0.moverY(p2c0.getY()+400);
                            p4c0.moverY(p3c0.getY()+400);
                        }
                        if (p2c0.enArea(px,py)){
                            p2c0.moverY(py);
                            p1c0.moverY(p2c0.getY()-145);
                            p3c0.moverY(p2c0.getY()+400);
                            p4c0.moverY(p3c0.getY()+400);
                        }
                        if (p3c0.enArea(px,py)){
                            p3c0.moverY(py);
                            p2c0.moverY(p3c0.getY()-145);
                            p1c0.moverY(p2c0.getY()-145);
                            p4c0.moverY(p3c0.getY()+400);
                        }
                        if (p4c0.enArea(px,py)){
                            p4c0.moverY(py);
                            p3c0.moverY(p4c0.getY()-145);
                            p2c0.moverY(p3c0.getY()-145);
                            p1c0.moverY(p2c0.getY()-145);
                        }
                        break;
                    case "cat1":
                        if (p1c1.enArea(px,py)){
                            p1c1.moverY(py);
                            p2c1.moverY(p1c1.getY()+400);
                            p3c1.moverY(p2c1.getY()+400);
                            p4c1.moverY(p3c1.getY()+400);
                        }
                        if (p2c1.enArea(px,py)){
                            p2c1.moverY(py);
                            p1c1.moverY(p2c1.getY()-145);
                            p3c1.moverY(p2c1.getY()+400);
                            p4c1.moverY(p3c1.getY()+400);
                        }
                        if (p3c1.enArea(px,py)){
                            p3c1.moverY(py);
                            p2c1.moverY(p3c1.getY()-145);
                            p1c1.moverY(p2c1.getY()-145);
                            p4c1.moverY(p3c1.getY()+400);
                        }
                        if (p4c1.enArea(px,py)){
                            p4c1.moverY(py);
                            p3c1.moverY(p4c1.getY()-145);
                            p2c1.moverY(p3c1.getY()-145);
                            p1c1.moverY(p2c1.getY()-145);
                        }
                        break;
                    case "cat2":
                        if (p1c2.enArea(px,py)){
                            p1c2.moverY(py);
                            p2c2.moverY(p1c2.getY()+400);
                            p3c2.moverY(p2c2.getY()+400);
                            p4c2.moverY(p3c2.getY()+400);
                        }
                        if (p2c2.enArea(px,py)){
                            p2c2.moverY(py);
                            p1c2.moverY(p2c2.getY()-145);
                            p3c2.moverY(p2c2.getY()+400);
                            p4c2.moverY(p3c2.getY()+400);
                        }
                        if (p3c2.enArea(px,py)){
                            p3c2.moverY(py);
                            p2c2.moverY(p3c2.getY()-145);
                            p1c2.moverY(p2c2.getY()-145);
                            p4c2.moverY(p3c2.getY()+400);
                        }
                        if (p4c2.enArea(px,py)){
                            p4c2.moverY(py);
                            p3c2.moverY(p4c2.getY()-145);
                            p2c2.moverY(p3c2.getY()-145);
                            p1c2.moverY(p2c2.getY()-145);
                        }
                        break;
                    case "cat3":
                        if (p1c3.enArea(px,py)){
                            p1c3.moverY(py);
                            p2c3.moverY(p1c3.getY()+400);
                            p3c3.moverY(p2c3.getY()+400);
                            p4c3.moverY(p3c3.getY()+400);
                        }
                        if (p2c3.enArea(px,py)){
                            p2c3.moverY(py);
                            p1c3.moverY(p2c3.getY()-145);
                            p3c3.moverY(p2c3.getY()+400);
                            p4c3.moverY(p3c3.getY()+400);
                        }
                        if (p3c3.enArea(px,py)){
                            p3c3.moverY(py);
                            p2c3.moverY(p3c3.getY()-145);
                            p1c3.moverY(p2c3.getY()-145);
                            p4c3.moverY(p3c3.getY()+400);
                        }
                        if (p4c3.enArea(px,py)){
                            p4c3.moverY(py);
                            p3c3.moverY(p4c3.getY()-145);
                            p2c3.moverY(p3c3.getY()-145);
                            p1c3.moverY(p2c3.getY()-145);
                        }
                        break;
                }


        }
        invalidate();
        return true;
    }
}
