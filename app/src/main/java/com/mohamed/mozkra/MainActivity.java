package com.mohamed.mozkra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner faculty = (Spinner)findViewById(R.id.faculty);
        final Spinner department = (Spinner)findViewById(R.id.department);
        final Spinner year = (Spinner)findViewById(R.id.year);
        final Spinner semester = (Spinner)findViewById(R.id.semester);
        final Spinner material = (Spinner)findViewById(R.id.material);


        ArrayAdapter facultyAdapter = ArrayAdapter.createFromResource(this,R.array.faculty,
                android.R.layout.simple_spinner_dropdown_item);
        faculty.setAdapter(facultyAdapter);

        faculty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(faculty.getSelectedItem().toString().equals("Politics and Economy")) {
                    department.setVisibility(View.GONE);
                    year.setVisibility(View.VISIBLE);
                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.year, android.R.layout.simple_spinner_dropdown_item);
                    year.setAdapter(yearAdapter);
                }
                else if(faculty.getSelectedItem().toString().equals("Fish resources and marine studies")) {
                    department.setVisibility(View.VISIBLE);
                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.departmentfr, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(yearAdapter);
                }
                    }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
                });



        department.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")){
                            if( department.getSelectedItem().toString().equals("Ocean")){
                                year.setVisibility(View.VISIBLE);
                               semester.setVisibility(View.GONE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.yearRF1, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);}
                            else if (department.getSelectedItem().toString().equals("هندسة بحرية")){
                                    year.setVisibility(View.VISIBLE);
                                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                            R.array.yearRF2, android.R.layout.simple_spinner_dropdown_item);
                                    year.setAdapter(yearAdapter);}
                            else if (department.getSelectedItem().toString().equals("مميز")){
                                year.setVisibility(View.VISIBLE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.yearRF, android.R.layout.simple_spinner_dropdown_item);
                                year.setAdapter(yearAdapter);}
                            else if (department.getSelectedItem().toString().equals("سلامة بحرية")){
                                year.setVisibility(View.GONE);
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialfr, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(yearAdapter);}


                        }}


                            public void onNothingSelected (AdapterView < ? > parent){
                            }
                         });


        year.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(faculty.getSelectedItem().toString().equals("Politics and Economy")){
                        if(year.getSelectedItem().toString().equals("first year P.E")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterpe1, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }else if(year.getSelectedItem().toString().equals("second year P.E")) {
                            semester.setVisibility(View.VISIBLE);
                            ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.semesterpe2, android.R.layout.simple_spinner_dropdown_item);
                            semester.setAdapter(semesterAdapter);
                        }
                    }
                    else if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")){

                       if (year.getSelectedItem().toString().equals("First year F.R")){
                                semester.setVisibility(View.GONE);
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialfr1, android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(semesterAdapter);

                            }
                            else if (year.getSelectedItem().toString().equals("Second year F.R")){
                                semester.setVisibility(View.VISIBLE);
                                ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.semesterfr1, android.R.layout.simple_spinner_dropdown_item);
                                semester.setAdapter(semesterAdapter);

                            }
                       else if (year.getSelectedItem().toString().equals("first year F.R")){
                           semester.setVisibility(View.VISIBLE);
                           ArrayAdapter semesterAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                   R.array.semesterfr11, android.R.layout.simple_spinner_dropdown_item);
                           semester.setAdapter(semesterAdapter);

                       }
                        }}


                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


        semester.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if (faculty.getSelectedItem().toString().equals("Politics and Economy")){
                        if(semester.getSelectedItem().toString().equals("first semester Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialpe11,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }else if(semester.getSelectedItem().toString().equals("second semester Y1")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialpe12,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }else if(semester.getSelectedItem().toString().equals("first semester Y2")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialpe21,android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(materialAdapter);
                        }}
                        else if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")){
                            if(semester.getSelectedItem().toString().equals("first semester - second year")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialfr112,android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }
                            else if(semester.getSelectedItem().toString().equals("first semester - first year")) {
                                material.setVisibility(View.VISIBLE);
                                ArrayAdapter materialAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                        R.array.materialfr11,android.R.layout.simple_spinner_dropdown_item);
                                material.setAdapter(materialAdapter);
                            }
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
        material.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if (faculty.getSelectedItem().toString().equals("Politics and Economy")) {
                            if (material.getSelectedItem().toString().equals("مبادئ القانون 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCdFY2NF96NVFoQVU");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مبادئ العلوم السياسة")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLS15d1Juc0dENEk");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مبادئ السلوك التنظيمى")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLU5IdmNodXFBOXM");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("اقتصاد جزئى")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLW5FdEVHdXk2a2M");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("امتحانات 1")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLUpjaTVSYmRCaGs");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مبادئ القانون 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLU5lNnBld1BkVW8");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("مبادئ احصاء")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLUZLVmJENmVsYW8");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("حقوق انسان")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLVZWSmRMb0d5Smc");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("الادارة العامة")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLVFyUEhzVElVYVU");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("اقتصاد كلى")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLVZfUHhncGM3UXM");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("international organization")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLVVGYjJIUmgwMlE");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("امتحانات 2")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/0B71nZ7yuupSCLW5hVGd1N3pqcjQ");
                                startActivity(i);
                            } else if (material.getSelectedItem().toString().equals("امتحان اقتصاد")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/drive/folders/1-1BCTt6cZxAxQZ-9he2esNYisgNFspmu");
                                startActivity(i);
                            }
                        }
                        else if (faculty.getSelectedItem().toString().equals("Fish resources and marine studies")){
                            if (material.getSelectedItem().toString().equals("final oceanography")) {
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=1nWnuAB3orMucrw8K1cuqn7um6sY_fFFf");
                                startActivity(i);
                            }
                            else if (material.getSelectedItem().toString().equals("فلك وأرصاد جوية")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=18OTLPuLL-Na4VG9WWNW52SGqve77gyH9");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("بحيرات")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=1y89UHfyCaZAgkwnra30FAymDSIskNlja");
                                startActivity(i);

                            }else if (material.getSelectedItem().toString().equals("MidTerm")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=1P9oinJETZoRASPIcVy6Y9xTGBWcS2ZWG");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Exams1")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=1LF64vl-ZfjO-jwe29bnruZWTIrSCHNdO");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Exams2")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=1TE26J2WqvHjizB9SUGdaKs8Ws8IJQ-Js");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Exams")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=1q20dfK13htE1YhCXBMKqqra-1MWMVOVp");
                                startActivity(i);

                            } else if (material.getSelectedItem().toString().equals("فلك وارصاد جوية")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=18OTLPuLL-Na4VG9WWNW52SGqve77gyH9");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("بحيـرات")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=1y89UHfyCaZAgkwnra30FAymDSIskNlja");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Caga culture")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=0Bx1TXZ-UjRguYlo3NWFET1RadGM");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("تسويق")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=0B9nviOTHpzByeFdpdko1Ny1UcXM");
                                startActivity(i);

                            }
                            else if (material.getSelectedItem().toString().equals("Caga culture-fourth year")){
                                Intent i = new Intent(MainActivity.this, study.class);
                                i.putExtra("url", "https://drive.google.com/open?id=0Bx1TXZ-UjRguaGRrNHJJa01CSnc");
                                startActivity(i);

                            }


                        }
                    }
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
    }
}
