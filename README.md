<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"

>
    <TextView
            android:text="UMS"
            android:layout_width="79dp"
            android:layout_height="41dp" android:id="@+id/textView6"
            app:layout_constraintStart_toStartOf="parent" app:layout_constraintEnd_toEndOf="parent"
            android:textSize="34sp" android:textStyle="bold" app:layout_constraintTop_toTopOf="parent"
            android:layout_marginTop="60dp"/>
    <LinearLayout
            android:orientation="horizontal"
            android:layout_width="0dp"
            android:layout_height="0dp"
            android:id="@+id/linearLayout" android:layout_marginTop="150dp" android:layout_marginBottom="150dp"
            app:layout_constraintEnd_toEndOf="parent" app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintBottom_toBottomOf="parent" android:layout_marginStart="1dp"
            android:layout_marginEnd="1dp">


        <LinearLayout android:orientation="vertical" android:layout_width="100dp" android:layout_height="100dp"

       >
            <TextView
                    android:text="  Name"
                    android:layout_width="200dp"
                    android:layout_height="wrap_content" android:id="@+id/textView5" android:layout_weight="1"
                    android:textSize="20sp" android:textColor="#0C0C0C" android:layout_marginTop="4dp"/>
            <TextView
                    android:text="  Reg No"
                    android:layout_width="100dp"
                    android:textSize="20sp" android:textColor="#0C0C0C"
                    android:layout_height="wrap_content" android:id="@+id/textView4" android:layout_weight="1"/>
       </LinearLayout>
        <LinearLayout
                android:orientation="vertical"
                android:layout_width="259dp"
                android:layout_marginRight="102dp"

                android:layout_height="200dp">
            <EditText
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="textPersonName"
                    android:ems="10"
                    android:id="@+id/editTextTextPersonName4" android:hint="Enter your name"/>
            <EditText
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="textPersonName"
                    android:ems="10"
                    android:id="@+id/editTextTextPersonName3" android:hint="Enter your Reg No"/>
            <Button
                    android:text="Submit"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content" android:id="@+id/button3"/>
        </LinearLayout>
    </LinearLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
