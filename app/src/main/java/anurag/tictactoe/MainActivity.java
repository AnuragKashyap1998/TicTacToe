package anurag.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int[][] input;
    private TextView mytext;
    private String str;
    private int tic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        input=new int[3][3];
        tic=0;
        str="X";
        for(int i=0;i<input.length;i++)
        {
            for(int j=0;j<input[i].length;j++)
            {
                input[i][j]=0;
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext=(TextView)findViewById(R.id.mytext);
        Button reset=(Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input=new int[3][3];
                tic=0;
                str="X";
                for(int i=0;i<input.length;i++)
                {
                    for(int j=0;j<input[i].length;j++)
                    {
                        input[i][j]=0;
                    }
                }
                mytext.setText("Player 1 turn");
                Button button=(Button)findViewById(R.id.button);
                button.setText(null);
                Button button9=(Button)findViewById(R.id.button9);
                button9.setText(null);
                Button button2=(Button)findViewById(R.id.button2);
                button2.setText(null);
                Button button3=(Button)findViewById(R.id.button3);
                button3.setText(null);
                Button button4=(Button)findViewById(R.id.button4);
                button4.setText(null);
                Button button5=(Button)findViewById(R.id.button5);
                button5.setText(null);
                Button button6=(Button)findViewById(R.id.button6);
                button6.setText(null);
                Button button7=(Button)findViewById(R.id.button7);
                button7.setText(null);
                Button button8=(Button)findViewById(R.id.button8);
                button8.setText(null);

            }
        });
        final Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input[0][0] == 0) {

                    if (str.charAt(0) == 'X') {
                        button.setText(str);
                        input[0][0] = 1;
                        tic = 1;
                        str = "O";
                    } else if (str.charAt(0) == 'O') {
                        button.setText(str);
                        input[0][0] = 2;
                        tic = 2;
                        str = "X";
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                      mytext.setText("Player 1 turn");
                    }

                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[0][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][0] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int k;
                    for (k = 0; k < 3; k++) {
                        if (input[k][k] != tic) {
                            break;
                        }
                    }
                    if (k == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
        final Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input[0][1] == 0) {
                    if (str.charAt(0) == 'X') {
                        button2.setText(str);
                        input[0][1] = 1;
                        str = "O";
                        tic = 1;

                    } else if (str.charAt(0) == 'O') {
                        button2.setText(str);
                        input[0][1] = 2;
                        str = "X";
                        tic = 2;
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                        mytext.setText("Player 1 turn");
                    }
                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[0][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][1] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
        final Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input[0][2] == 0) {
                    if (str.charAt(0) == 'X') {
                        button3.setText(str);
                        input[0][2] = 1;
                        str = "O";
                        tic = 1;
                    } else if (str.charAt(0) == 'O') {
                        button3.setText(str);
                        input[0][2] = 2;
                        str = "X";
                        tic = 2;
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                        mytext.setText("Player 1 turn");
                    }
                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[0][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][2] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int k;
                    int p = 2;
                    for (k = 0; k < 3; k++) {
                        if (input[k][p] != tic) {
                            break;
                        }
                        p--;
                    }
                    if (k == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
        final Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input[1][0]==0) {
                    if (str.charAt(0) == 'X') {
                        button4.setText(str);
                        input[1][0] = 1;
                        str = "O";
                        tic = 1;
                    } else if (str.charAt(0) == 'O') {
                        button4.setText(str);
                        input[1][0] = 2;
                        str = "X";
                        tic = 2;
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                        mytext.setText("Player 1 turn");
                    }
                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[1][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][0] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
        final Button button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input[1][1] == 0) {
                    if (str.charAt(0) == 'X') {
                        button5.setText(str);
                        input[1][1] = 1;
                        str = "O";
                        tic = 1;
                    } else if (str.charAt(0) == 'O') {
                        button5.setText(str);
                        input[1][1] = 2;
                        str = "X";
                        tic = 2;
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                        mytext.setText("Player 1 turn");
                    }
                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[1][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][1] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int k;
                    for (k = 0; k < 3; k++) {
                        if (input[k][k] != tic) {
                            break;
                        }
                    }
                    if (k == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int q;
                    int p = 2;
                    for (q = 0; q < 3; q++) {
                        if (input[q][p] != tic) {
                            break;
                        }
                        p--;
                    }
                    if (q == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
        final Button button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input[1][2] == 0) {
                    if (str.charAt(0) == 'X') {
                        button6.setText(str);
                        input[1][2] = 1;
                        str = "O";
                        tic = 1;
                    } else if (str.charAt(0) == 'O') {
                        button6.setText(str);
                        input[1][2] = 2;
                        str = "X";
                        tic = 2;
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                        mytext.setText("Player 1 turn");
                    }
                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[1][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][2] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
        final Button button7=(Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input[2][0]==0) {
                    if (str.charAt(0) == 'X') {
                        button7.setText(str);
                        input[2][0] = 1;
                        str = "O";
                        tic = 1;
                    } else if (str.charAt(0) == 'O') {
                        button7.setText(str);
                        input[2][0] = 2;
                        str = "X";
                        tic = 2;
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                        mytext.setText("Player 1 turn");
                    }
                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[2][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][0] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int k;
                    int p = 2;
                    for (k = 0; k < 3; k++) {
                        if (input[k][p] != tic) {
                            break;
                        }
                        p--;
                    }
                    if (k == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
        final Button button8=(Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input[2][1]==0) {
                    if (str.charAt(0) == 'X') {
                        button8.setText(str);
                        input[2][1] = 1;
                        str = "O";
                        tic = 1;
                    } else if (str.charAt(0) == 'O') {
                        button8.setText(str);
                        input[2][1] = 2;
                        str = "X";
                        tic = 2;
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                        mytext.setText("Player 1 turn");
                    }
                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[2][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][1] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
        final Button button9=(Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input[2][2] == 0) {
                    if (str.charAt(0) == 'X') {
                        button9.setText(str);
                        input[2][2] = 1;
                        str = "O";
                        tic = 1;
                    } else if (str.charAt(0) == 'O') {
                        button9.setText(str);
                        input[2][2] = 2;
                        str = "X";
                        tic = 2;
                    }
                    if(tic==1)
                    {
                        mytext.setText("Player 2 turn");
                    }
                    else
                    {
                        mytext.setText("Player 1 turn");
                    }
                    int i;
                    for (i = 0; i < 3; i++) {
                        if (input[2][i] != tic) {
                            break;
                        }
                    }
                    if (i == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int j = 0;
                    for (j = 0; j < 3; j++) {
                        if (input[j][2] != tic) {
                            break;
                        }
                    }
                    if (j == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int k;
                    for (k = 0; k < 3; k++) {
                        if (input[k][k] != tic) {
                            break;
                        }
                    }
                    if (k == 3) {
                        if(tic==1) {
                            mytext.setText("Player 1 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                        else
                        {
                            mytext.setText("Player 2 Won");
                            for(int l=0;l<3;l++)
                            {
                                for(int m=0;m<3;m++)
                                {
                                    input[l][m]=3;
                                }
                            }
                        }
                    }
                    int f=0;
                    for(int d=0;d<3;d++)
                    {
                        int e=0;
                        for( e=0;e<3;e++)
                        {
                            if(input[d][e]==0)
                            {
                                break;
                            }
                            if(input[d][e]==3)
                            {
                                break;
                            }
                            if(input[d][e]!=0)
                            {
                                f++;
                                if(f==9)
                                {
                                    mytext.setText("Draw");
                                }
                            }
                        }
                        if(e!=3)
                        {
                            break;
                        }
                    }
                }
            }
        });
    }

}
