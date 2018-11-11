package mx.edu.ittepic.u3e6_joseantoniorivasnavarrete;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class Lienzo extends View {

    Image logo, cat, cat0, cat1, cat2, cat3, des, des0, des1, des2, des3, b1,b11;
    MainActivity puntero;
    public Lienzo(Context context){
        super(context);
        puntero = (MainActivity) context;
        logo = new Image(R.drawable.logo,150,150,10,10,true,this,null);
        cat = new Image( R.drawable.cat,50,50,10,190,true,this,null);
        cat0 = new Image( R.drawable.cat0,330,330,10,260,true,this,null);
        cat1 = new Image( R.drawable.cat1,330,330,360,260,true,this,null );
        cat2 = new Image( R.drawable.cat2,330,330,700,260,true,this,null );
        cat3 = new Image( R.drawable.cat3,330,330,1040,260,true,this,null );
        des = new Image( R.drawable.des,700,350,10,640,true,this,null);
        des0 = new Image( R.drawable.tdes0,700,335,10,710,false,this,null);
        des1 = new Image( R.drawable.tdes1,700,335,10,710,false,this,null);
        des2 = new Image( R.drawable.tdes2,700,335,10,710,false,this,null);
        des3 = new Image( R.drawable.tdes3,700,335,10,710,false,this,null);
        b1 = new Image(R.drawable.bta,200,50,500,1030,false,this,null);
        b11 = new Image(R.drawable.btv,200,50,500,1030,false,this,null);

    }
    @Override
    public void onDraw(Canvas c){
        Paint p = new Paint();
        logo.pintar(c,p);
        p.setTextSize(75);
        p.setColor( Color.parseColor("#01a0ca"));
        c.drawText( "okians",140,100,p);
        cat.pintar( c,p );
        p.setTextSize(35);
        p.setColor( Color.parseColor("#4d5766"));
        c.drawText( "Categorías",70,220,p);
        cat0.pintar( c,p );
        cat0.texto( c,p,"Futures Phones",25,Color.parseColor("#3f48cc"),"debajo");
        cat1.pintar( c,p );
        cat1.texto( c,p,"Gama Baja",25,Color.parseColor("#3f48cc"),"debajo");
        cat2.pintar( c,p );
        cat2.texto( c,p,"Gama Media",25,Color.parseColor("#3f48cc"),"debajo");
        cat3.pintar( c,p );
        cat3.texto( c,p,"Gama Alta",25,Color.parseColor("#3f48cc"),"debajo");
        des.pintar( c,p );
        p.setTextSize(35);
        p.setTextAlign(Paint.Align.LEFT);
        p.setColor( Color.WHITE);
        c.drawText( "Descripción",20,685,p);
        des0.pintar( c,p );
        des1.pintar( c,p );
        des2.pintar( c,p );
        des3.pintar( c,p );
        b11.pintar(c,p);
        b11.texto(c,p,"Entrar",25,Color.WHITE,"centro");
        b1.pintar(c,p);
        b1.texto(c,p,"Entrar",25,Color.WHITE,"centro");
        c.drawText("cat"+ puntero.cat,10,120,p);

    }
    public boolean onTouchEvent(MotionEvent e){
        float px=e.getX();
        float py=e.getY();

        switch (e.getAction()){
            case MotionEvent.ACTION_DOWN:
                if (cat0.enArea( px,py )){
                    des0.visible( true );
                    des1.visible( false );
                    des2.visible( false );
                    des3.visible( false );
                    b1.visible(true);
                    puntero.cat="cat0";
                }
                if (cat1.enArea( px,py )){
                    des0.visible( false );
                    des1.visible( true );
                    des2.visible( false );
                    des3.visible( false );
                    b1.visible(true);
                    puntero.cat="cat1";
                }
                if (cat2.enArea( px,py )){
                    des0.visible( false );
                    des1.visible( false );
                    des2.visible( true );
                    des3.visible( false );
                    b1.visible(true);
                    puntero.cat="cat2";
                }
                if (cat3.enArea( px,py )){
                    des0.visible( false );
                    des1.visible( false );
                    des2.visible( false );
                    des3.visible( true );
                    b1.visible(true);
                    puntero.cat="cat3";
                }
                if  (b1.enArea(px,py))
                    puntero.ventana2();
                break;
            case MotionEvent.ACTION_MOVE:
                if (cat0.enArea(px,py)){
                    cat0.moverX(px);
                    cat1.moverX(cat0.getX()+525);
                    cat2.moverX(cat1.getX()+525);
                    cat3.moverX(cat2.getX()+525);
                }
                if (cat1.enArea(px,py)){
                    cat1.moverX( px );
                    cat0.moverX(cat1.getX()-175);
                    cat2.moverX(cat1.getX()+525);
                    cat3.moverX(cat2.getX()+525);
                }
                if (cat2.enArea( px,py )){
                    cat2.moverX( px );
                    cat1.moverX( cat2.getX()-175);
                    cat0.moverX( cat1.getX()-175);
                    cat3.moverX(cat2.getX()+525);
                }
                if (cat3.enArea(px,py)){
                    cat3.moverX( px );
                    cat2.moverX(cat3.getX()-175);
                    cat1.moverX(cat2.getX()-525);
                    cat0.moverX(cat1.getX()-525);
                }
                break;
        }
        invalidate();
        return true;

    }

}