package com.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends Activity {
	int one=0,two=0,ans=0,flag=5;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button = (Button)findViewById(R.id.button1);
        OnClickListener oneListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"1");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"1");

            }
        };

        button.setOnClickListener(oneListener);
        
        Button button2 = (Button)findViewById(R.id.button2);
        OnClickListener twoListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"2");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"2");

            }
        };

        button2.setOnClickListener(twoListener);
        
        Button button3 = (Button)findViewById(R.id.button3);
        OnClickListener threeListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"3");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"3");

            }
        };

        button3.setOnClickListener(threeListener);
        
        Button button4 = (Button)findViewById(R.id.button4);
        OnClickListener fourListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"4");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"4");

            }
        };

        button4.setOnClickListener(fourListener);
        
        Button button5 = (Button)findViewById(R.id.button5);
        OnClickListener fiveListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"5");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"5");

            }
        };

        button5.setOnClickListener(fiveListener);
        
        Button button6 = (Button)findViewById(R.id.button6);
        OnClickListener sixListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"6");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"6");

            }
        };

        button6.setOnClickListener(sixListener);
        
        Button button7 = (Button)findViewById(R.id.button7);
        OnClickListener sevenListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"7");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"7");

            }
        };

        button7.setOnClickListener(sevenListener);
        
        Button button8 = (Button)findViewById(R.id.button8);
        OnClickListener eightListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"8");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"8");

            }
        };

        button8.setOnClickListener(eightListener);
        
        Button button9 = (Button)findViewById(R.id.button9);
        OnClickListener nineListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"9");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"9");

            }
        };

        button9.setOnClickListener(nineListener);
        
        
        Button button0 = (Button)findViewById(R.id.button12);
        OnClickListener zeroListener = new OnClickListener() {
        public void onClick(View v) {
            	EditText editText = (EditText)findViewById(R.id.editText1);
            	editText.setText(editText.getText()+"0");
            	
            	EditText full = (EditText)findViewById(R.id.editText2);
            	full.setText(full.getText()+"0");

            }
        };

        button0.setOnClickListener(zeroListener);
        
        
        Button buttonplus = (Button)findViewById(R.id.button14);
        OnClickListener plusListener = new OnClickListener() {
        public void onClick(View v) {
        	
        	EditText full = (EditText)findViewById(R.id.editText2);
        	full.setText(full.getText()+"+");
        	
        	EditText editText = (EditText)findViewById(R.id.editText1);
        	
        	switch(flag){
        	
        	case 1 : one = one + Integer.parseInt( editText.getText().toString());break;
        	case 2 : one = one - Integer.parseInt( editText.getText().toString());break;
        	case 3 : one = one / Integer.parseInt( editText.getText().toString());break;
        	case 4 : one = one * Integer.parseInt( editText.getText().toString());break;
        	
        	case 5 : one = Integer.parseInt( editText.getText().toString());break;
        	
        	}
        	
        	
        	editText.setText("");
        	
        	flag=1;
        	 
        	EditText interim = (EditText)findViewById(R.id.editText3);
         	interim.setText(Integer.toString(one));
         	

            }
        };

        buttonplus.setOnClickListener(plusListener);
        
  
        
        Button buttonminus = (Button)findViewById(R.id.button13);
        OnClickListener minusListener = new OnClickListener() {
        public void onClick(View v) {
        	
        	EditText full = (EditText)findViewById(R.id.editText2);
        	full.setText(full.getText()+"-");
        	
        	EditText editText = (EditText)findViewById(R.id.editText1);
        	
        	switch(flag){
        	case 1 : one = one + Integer.parseInt( editText.getText().toString());break;
        	case 2 : one = one - Integer.parseInt( editText.getText().toString());break;
        	case 3 : one = one / Integer.parseInt( editText.getText().toString());break;
        	case 4 : one = one * Integer.parseInt( editText.getText().toString());break;
        	
        	case 5 : one = Integer.parseInt( editText.getText().toString());break;
        	
        	}
        	
        	
        	
        	editText.setText("");
        	 flag=2;
        	 
        	 EditText interim = (EditText)findViewById(R.id.editText3);
          	interim.setText(Integer.toString(one));

            }
        };

        buttonminus.setOnClickListener(minusListener);
        
        

        Button buttondivide = (Button)findViewById(R.id.button16);
        OnClickListener divideListener = new OnClickListener() {
        public void onClick(View v) {
        	
        	EditText full = (EditText)findViewById(R.id.editText2);
        	full.setText(full.getText()+"/");
        	
        	EditText editText = (EditText)findViewById(R.id.editText1);
        	
        	switch(flag){
        	
        	case 1 : one = one + Integer.parseInt( editText.getText().toString());break;
        	case 2 : one = one - Integer.parseInt( editText.getText().toString());break;
        	case 3 : one = one / Integer.parseInt( editText.getText().toString());break;
        	case 4 : one = one * Integer.parseInt( editText.getText().toString());break;
        	
        	case 5 : one = Integer.parseInt( editText.getText().toString());break;
        	
        	}
        	
        	
        	editText.setText("");
        	
        	flag=3;
        	 
        	EditText interim = (EditText)findViewById(R.id.editText3);
         	interim.setText(Integer.toString(one));
         	

            }
        };

        buttondivide.setOnClickListener(divideListener);
        
        

        Button buttonmul = (Button)findViewById(R.id.button17);
        OnClickListener mulListener = new OnClickListener() {
        public void onClick(View v) {
        	
        	EditText full = (EditText)findViewById(R.id.editText2);
        	full.setText(full.getText()+"x");
        	
        	EditText editText = (EditText)findViewById(R.id.editText1);
        	
        	switch(flag){
        	
        	case 1 : one = one + Integer.parseInt( editText.getText().toString());break;
        	case 2 : one = one - Integer.parseInt( editText.getText().toString());break;
        	case 3 : one = one / Integer.parseInt( editText.getText().toString());break;
        	case 4 : one = one * Integer.parseInt( editText.getText().toString());break;
        	
        	case 5 : one = Integer.parseInt( editText.getText().toString());break;
        	
        	}
        	
        	
        	editText.setText("");
        	
        	flag=4;
        	 
        	EditText interim = (EditText)findViewById(R.id.editText3);
         	interim.setText(Integer.toString(one));
         	

            }
        };

        buttonmul.setOnClickListener(mulListener);
        

        Button buttonclear = (Button)findViewById(R.id.button11);
        OnClickListener clearListener = new OnClickListener() {
        public void onClick(View v) {
        	
        	EditText full = (EditText)findViewById(R.id.editText2);
        	full.setText("");
        	
        	EditText anss2 = (EditText)findViewById(R.id.editText3);
        	anss2.setText("");
        	
        	EditText editText = (EditText)findViewById(R.id.editText1);
        	
        	 editText.setText("");
        	 one=0;
        	 two=0;
        	 flag=5;
        	

            }
        };

        buttonclear.setOnClickListener(clearListener);
        
        Button buttonclear2 = (Button)findViewById(R.id.button10);
        OnClickListener clearListener2 = new OnClickListener() {
        public void onClick(View v) {
        	
        	EditText anss2 = (EditText)findViewById(R.id.editText3);
        	anss2.setText("");
        	
        	EditText full = (EditText)findViewById(R.id.editText2);
        	full.setText("");
        	
        	
        	EditText editText = (EditText)findViewById(R.id.editText1);
        	
        	editText.setText("");
        	one=0;
        	two=0;
        	flag=5;

            }
        };

        buttonclear2.setOnClickListener(clearListener2);
        
        Button equal = (Button)findViewById(R.id.button15);
        OnClickListener equalListener = new OnClickListener() {
        public void onClick(View v) {
           	EditText editText = (EditText)findViewById(R.id.editText1);
            two = Integer.parseInt( editText.getText().toString());
            
            switch(flag){
            case 1 : ans=one+two;break;
            case 2 : ans=one-two;break;
            case 3 : ans=one/two;break;
            case 4 : ans=one*two;break;
            }
            
            flag=6;
            String test = Integer.toString(ans);
            editText.setText(test);
            
        	EditText anss = (EditText)findViewById(R.id.editText3);
        	anss.setText(test);
            

            }
        };

        equal.setOnClickListener(equalListener);
        


    }
}