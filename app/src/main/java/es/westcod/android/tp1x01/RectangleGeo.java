package es.westcod.android.tp1x01;

/**
 * Created by ampedPF on 26/03/2015.
 */
public class RectangleGeo {
/* Members variables */
public int mX;
public int mY;
public int mWidth;
public int mHeight;

        /* Default Constructor */
        public RectangleGeo(){
            mX = 0;
            mY = 0;
            mWidth = 10;
            mHeight = 10;
        }

        /**
         *
         * @param X: X coordinates
         * @param Y: Y coordinates
         * @param width: Rectangle width
         * @param height: Rectangle height
         */
        public RectangleGeo(int X, int Y, int width, int height){
            if (X < 0 || Y < 0 || width < 0 || height < 0) X = Y = width = height = 0;

            mX = X;
            mY = Y;
            mWidth = width;
            mHeight = height;
        }

        /* Getters and Setters */
        public int getmX(){
            return mX;
        }
        public void setmX(int X){
            mX = X;
        }

        public int getmY(){
            return mY;
        }
        public void setmY(int Y){
            mY = Y;
        }

        public int getmWidth(){
            return mWidth;
        }
        public void setmWidth(int width){
            mWidth = width;
        }

        public int getmHeight(){
            return mHeight;
        }
        public void setmHeight(int height){
            mHeight = height;
        }

        public int getRightBorderPosition(){
            return mX + mWidth;
        }
        public  int getBottomBorderPosition(){
            return mY + mHeight;
        }
}
