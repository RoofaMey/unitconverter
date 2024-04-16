package unitConverter;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UnitConverter extends JFrame{

	//Image icon
		ImageIcon icon = new ImageIcon("icon.png");
		
	//Background image
		ImageIcon bgimage = new ImageIcon(new ImageIcon("bg.jpg").getImage().getScaledInstance( 600, 600, Image.SCALE_SMOOTH));
		
	//Labels
		JLabel unitconverterlabel = new JLabel();
		JLabel unitfromlabel = new JLabel();
		JLabel unittolabel = new JLabel();
	
	//Combo box
		JComboBox<String> cbConverterUnit = new JComboBox<String>();
		JComboBox<String> cbUnitFrom = new JComboBox<String>();
		JComboBox<String> cbUnitTo = new JComboBox<String>();

	//textfields
		JTextField tbUnitFrom = new JTextField();
		JTextField tbUnitTo = new JTextField();

	//button
		JButton button = new JButton();

UnitConverter(){

	//frame
		this.setSize(500, 550);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Unit Converter");

		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		
//------------------------------------------------------------------------------------
	//image icon
		this.setIconImage(icon.getImage());
		
//------------------------------------------------------------------------------------
	//background photo
		this.setContentPane(new JLabel(bgimage));
		
		
//------------------------------------------------------------------------------------
	//JLabel for UNIT CONVERTER
		this.add(unitconverterlabel);
		unitconverterlabel.setBounds( 100, 10, 400, 100);
		unitconverterlabel.setText("UNIT CONVERTER");
		unitconverterlabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
	//JLabel - labels for unitfrom and unitto
		this.add(unitfromlabel);
		unitfromlabel.setBounds( 10, 165, 140, 20);
		unitfromlabel.setText("From:");
		unitfromlabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		this.add(unittolabel);
		unittolabel.setBounds( 325, 165, 140, 20);
		unittolabel.setText("To:");
		unittolabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		
//------------------------------------------------------------------------------------
	//combo boxes - Unit to Convert
		this.add(cbConverterUnit);
		cbConverterUnit.setBounds( 170, 100, 150, 25);
		cbConverterUnit.addItem("Length");
		cbConverterUnit.addItem("Weight");
		cbConverterUnit.addItem("Temperature");
		cbConverterUnit.addItem("Time");
		cbConverterUnit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				cbUnitFrom.removeAllItems();
				cbUnitTo.removeAllItems();

				//LENGTH
				if(cbConverterUnit.getSelectedItem().equals("Length")) {
					cbUnitFrom.addItem("Millimeter");
					cbUnitFrom.addItem("Centimeter");
					cbUnitFrom.addItem("Meter(s)");
					cbUnitFrom.addItem("Kilometer(s)");
					cbUnitFrom.addItem("Mile(s)");
					cbUnitFrom.addItem("Yard(s)");
					cbUnitFrom.addItem("Foot(ft)");
					cbUnitFrom.addItem("Inch(s)");

					cbUnitTo.addItem("Millimeter");
					cbUnitTo.addItem("Centimeter");
					cbUnitTo.addItem("Meter(s)");
					cbUnitTo.addItem("Kilometer(s)");
					cbUnitTo.addItem("Mile(s)");
					cbUnitTo.addItem("Yard(s)");
					cbUnitTo.addItem("Foot(ft)");
					cbUnitTo.addItem("Inch(s)");
				}
					
				//WEIGHT
				else if(cbConverterUnit.getSelectedItem().equals("Weight")) {
					cbUnitFrom.addItem("Gram(s)");
					cbUnitFrom.addItem("Milligram(s)");
					cbUnitFrom.addItem("Kilogram(s)");
					cbUnitFrom.addItem("Pound(s)");
					cbUnitFrom.addItem("Ounce(s)");
					
					cbUnitTo.addItem("Gram(s)");
					cbUnitTo.addItem("Milligram(s)");
					cbUnitTo.addItem("Kilogram(s)");
					cbUnitTo.addItem("Pound(s)");
					cbUnitTo.addItem("Ounce(s)");
				}
					
				//TEMPERATURE
				else if(cbConverterUnit.getSelectedItem().equals("Temperature")) {
					cbUnitFrom.addItem("Celsius");
					cbUnitFrom.addItem("Fahrenheit");
					cbUnitFrom.addItem("Kelvin");
					
					cbUnitTo.addItem("Celsius");
					cbUnitTo.addItem("Fahrenheit");
					cbUnitTo.addItem("Kelvin");
				}
					
				//TIME
				else if(cbConverterUnit.getSelectedItem().equals("Time")) {
					cbUnitFrom.addItem("Millisecond(s)");
					cbUnitFrom.addItem("Second(s)");
					cbUnitFrom.addItem("Minute(s)");
					cbUnitFrom.addItem("Hour(s)");
					cbUnitFrom.addItem("Day(s)");
					cbUnitFrom.addItem("Week(s)");
					cbUnitFrom.addItem("Month(s)");
					cbUnitFrom.addItem("Year(s)");
					
					cbUnitTo.addItem("Millisecond(s)");
					cbUnitTo.addItem("Second(s)");
					cbUnitTo.addItem("Minute(s)");
					cbUnitTo.addItem("Hour(s)");
					cbUnitTo.addItem("Day(s)");
					cbUnitTo.addItem("Week(s)");
					cbUnitTo.addItem("Month(s)");
					cbUnitTo.addItem("Year(s)");
				}
					
			}});
					
//------------------------------------------------------------------------------------
				
				//combo boxes
				//unit from
					this.add(cbUnitFrom);
					cbUnitFrom.setBounds( 10, 190, 150, 25);
				//unit to
					this.add(cbUnitTo);
					cbUnitTo.setBounds( 325, 190, 150, 25);
					
//------------------------------------------------------------------------------------
					
				//textfields/text boxes
				//unit from
					this.add(tbUnitFrom);
					tbUnitFrom.setBounds( 10, 250, 150, 25);
				//unit to
					this.add(tbUnitTo);
					tbUnitTo.setBounds( 325, 250, 150, 25);
					
//------------------------------------------------------------------------------------
					
			//button
				this.add(button);
				button.setBounds( 150, 300, 180, 30);
				button.setText("CONVERT");
				button.setFocusable(false);
				button.addActionListener(new ActionListener() {
					
				@Override
					public void actionPerformed(ActionEvent e) {
						String unitFrom = (String )cbUnitFrom.getSelectedItem();
						String unitTo = (String) cbUnitTo.getSelectedItem();
						
						double val = Double.parseDouble(tbUnitFrom.getText());
						double conversion = 0;
						
					//LENGTH
					//Millimeters
						if(unitFrom.equals("Millimeter") && unitTo.equals("Millimeter")) {
						conversion = val;
						} else if(unitFrom.equals("Millimeter") && unitTo.equals("Millimeter")) {
						conversion = val / 10;
						} else if(unitFrom.equals("Millimeter") && unitTo.equals("Centimeter")) {
						conversion = val / 10;
						} else if(unitFrom.equals("Millimeter") && unitTo.equals("Meter(s)")) {
						conversion = val / 1000;
						} else if(unitFrom.equals("Millimeter") && unitTo.equals("Kilometer(s)")) {
						conversion = val / 1e+6;
						} else if(unitFrom.equals("Millimeter") && unitTo.equals("Mile(s)")) {
						conversion = val / 1.609e+6;
						} else if(unitFrom.equals("Millimeter") && unitTo.equals("Yard(s)")) {
						conversion = val / 914.4;
						}  else if(unitFrom.equals("Millimeter") && unitTo.equals("Foot(ft)")) {
						conversion = val / 304.8;
						}  else if(unitFrom.equals("Millimeter") && unitTo.equals("Inch(s)")) {
						conversion = val / 25.4;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Centimeter
						if(unitFrom.equals("Centimeter") && unitTo.equals("Centimeter")) {
						conversion = val;
						} else if(unitFrom.equals("Centimeter") && unitTo.equals("Millimeter")) {
						conversion = val * 10;
						} else if(unitFrom.equals("Centimeter") && unitTo.equals("Meter(s)")) {
						conversion = val / 100;
						} else if(unitFrom.equals("Centimeter") && unitTo.equals("Kilometer(s)")) {
						conversion = val / 100000;
						} else if(unitFrom.equals("Centimeter") && unitTo.equals("Mile(s)")) {
						conversion = val / 160900;
						} else if(unitFrom.equals("Centimeter") && unitTo.equals("Yard(s)")) {
						conversion = val / 91.44;
						}  else if(unitFrom.equals("Centimeter") && unitTo.equals("Foot(ft)")) {
						conversion = val / 30.48;
						}  else if(unitFrom.equals("Centimeter") && unitTo.equals("Inch(s)")) {
						conversion = val / 2.54;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Meter(s)
						if(unitFrom.equals("Meter(s)") && unitTo.equals("Meter(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Meter(s)") && unitTo.equals("Millimeter")) {
						conversion = val * 1000;
						} else if(unitFrom.equals("Meter(s)") && unitTo.equals("Centimeter")) {
						conversion = val * 100;
						} else if(unitFrom.equals("Meter(s)") && unitTo.equals("Kilometer(s)")) {
						conversion = val / 1000;
						} else if(unitFrom.equals("Meter(s)") && unitTo.equals("Mile(s)")) {
						conversion = val / 1000;
						} else if(unitFrom.equals("Meter(s)") && unitTo.equals("Yard(s)")) {
						conversion = val * 1.094;
						}  else if(unitFrom.equals("Meter(s)") && unitTo.equals("Foot(ft)")) {
						conversion = val * 3.281;
						}  else if(unitFrom.equals("Meter(s)") && unitTo.equals("Inch(s)")) {
						conversion = val * 39.37;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Kilometer(s)
						if(unitFrom.equals("Kilometer(s)") && unitTo.equals("Kilometer(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Kilometer(s)") && unitTo.equals("Millimeter")) {
						conversion = val * 1e+6;
						} else if(unitFrom.equals("Kilometer(s)") && unitTo.equals("Centimeter")) {
						conversion = val * 100000;
						} else if(unitFrom.equals("Kilometer(s)") && unitTo.equals("Meter(s)")) {
						conversion = val * 1000;
						} else if(unitFrom.equals("Kilometer(s)") && unitTo.equals("Mile(s)")) {
						conversion = val / 1.609;
						} else if(unitFrom.equals("Kilometer(s)") && unitTo.equals("Yard(s)")) {
						conversion = val * 1094;
						}  else if(unitFrom.equals("Kilometer(s)") && unitTo.equals("Foot(ft)")) {
						conversion = val * 3281;
						}  else if(unitFrom.equals("Kilometer(s)") && unitTo.equals("Inch(s)")) {
						conversion = val * 39370;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Mile(s)
						if(unitFrom.equals("Mile(s)") && unitTo.equals("Mile(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Mile(s)") && unitTo.equals("Millimeter")) {
						conversion = val * 1.609e+6;
						} else if(unitFrom.equals("Mile(s)") && unitTo.equals("Centimeter")) {
						conversion = val * 160900;
						} else if(unitFrom.equals("Mile(s)") && unitTo.equals("Meter(s)")) {
						conversion = val * 1609;
						} else if(unitFrom.equals("Mile(s)") && unitTo.equals("Kilometer(s)")) {
						conversion = val * 1.609;
						} else if(unitFrom.equals("Mile(s)") && unitTo.equals("Yard(s)")) {
						conversion = val * 1760;
						}  else if(unitFrom.equals("Mile(s)") && unitTo.equals("Foot(ft)")) {
						conversion = val * 5280;
						}  else if(unitFrom.equals("Mile(s)") && unitTo.equals("Inch(s)")) {
						conversion = val * 63360;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Yard(s)
						if(unitFrom.equals("Yard(s)") && unitTo.equals("Yard(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Yard(s)") && unitTo.equals("Millimeter")) {
						conversion = val * 914.4;
						} else if(unitFrom.equals("Yard(s)") && unitTo.equals("Centimeter")) {
						conversion = val * 91.44;
						} else if(unitFrom.equals("Yard(s)") && unitTo.equals("Meter(s)")) {
						conversion = val / 1609;
						} else if(unitFrom.equals("Yard(s)") && unitTo.equals("Kilometer(s)")) {
						conversion = val / 1094;
						} else if(unitFrom.equals("Yard(s)") && unitTo.equals("Mile(s)")) {
						conversion = val / 1760;
						}  else if(unitFrom.equals("Yard(s)") && unitTo.equals("Foot(ft)")) {
						conversion = val * 3;
						}  else if(unitFrom.equals("Yard(s)") && unitTo.equals("Inch(s)")) {
						conversion = val * 36;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Foot(ft)
						if(unitFrom.equals("Foot(ft)") && unitTo.equals("Foot(ft)")) {
						conversion = val;
						} else if(unitFrom.equals("Foot(ft)") && unitTo.equals("Millimeter")) {
						conversion = val * 304.8;
						} else if(unitFrom.equals("Foot(ft)") && unitTo.equals("Centimeter")) {
						conversion = val * 30.48;
						} else if(unitFrom.equals("Foot(ft)") && unitTo.equals("Meter(s)")) {
						conversion = val / 3.281;
						} else if(unitFrom.equals("Foot(ft)") && unitTo.equals("Kilometer(s)")) {
						conversion = val / 3281;
						} else if(unitFrom.equals("Foot(ft)") && unitTo.equals("Mile(s)")) {
						conversion = val / 5280;
						}  else if(unitFrom.equals("Foot(ft)") && unitTo.equals("Yard(s)")) {
						conversion = val / 3;
						}  else if(unitFrom.equals("Foot(ft)") && unitTo.equals("Inch(s)")) {
						conversion = val * 12;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Inch(s)
						if(unitFrom.equals("Inch(s)") && unitTo.equals("Inch(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Inch(s)") && unitTo.equals("Millimeter")) {
						conversion = val * 25.4;
						} else if(unitFrom.equals("Inch(s)") && unitTo.equals("Centimeter")) {
						conversion = val * 2.54;
						} else if(unitFrom.equals("Inch(s)") && unitTo.equals("Meter(s)")) {
						conversion = val / 39.37;
						} else if(unitFrom.equals("Inch(s)") && unitTo.equals("Kilometer(s)")) {
						conversion = val / 39370;
						} else if(unitFrom.equals("Inch(s)") && unitTo.equals("Mile(s)")) {
						conversion = val / 63360;
						}  else if(unitFrom.equals("Inch(s)") && unitTo.equals("Yard(s)")) {
						conversion = val / 36;
						}  else if(unitFrom.equals("Inch(s)") && unitTo.equals("Foot(ft)")) {
						conversion = val / 12;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						

//---------------------------------------------------------------------------------------------------						
					//WEIGHT
					//Gram(s)
						if(unitFrom.equals("Gram(s)") && unitTo.equals("Gram(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Gram(s)") && unitTo.equals("Milligram(s)")) {
						conversion = val * 1000;
						} else if(unitFrom.equals("Gram(s)") && unitTo.equals("Kilogram(s)")) {
						conversion = val / 1000;
						} else if(unitFrom.equals("Gram(s)") && unitTo.equals("Pound(s)")) {
						conversion = val / 453.6;
						} else if(unitFrom.equals("Gram(s)") && unitTo.equals("Ounce(s)")) {
						conversion = val / 28.35;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Milligram(s)
						if(unitFrom.equals("Milligram(s)") && unitTo.equals("Milligram(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Milligram(s)") && unitTo.equals("Gram(s)")) {
						conversion = val / 1000;
						} else if(unitFrom.equals("Milligram(s)") && unitTo.equals("Kilogram(s)")) {
						conversion = val / 1e+6;
						} else if(unitFrom.equals("Milligram(s)") && unitTo.equals("Pound(s)")) {
						conversion = val / 453600;
						} else if(unitFrom.equals("Milligram(s)") && unitTo.equals("Ounce(s)")) {
						conversion = val / 453600;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Kilogram(s)
						if(unitFrom.equals("Kilogram(s)") && unitTo.equals("Kilogram(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Kilogram(s)") && unitTo.equals("Gram(s)")) {
						conversion = val * 1000;
						} else if(unitFrom.equals("Kilogram(s)") && unitTo.equals("Milligram(s)")) {
						conversion = val * 1e+6;
						} else if(unitFrom.equals("Kilogram(s)") && unitTo.equals("Pound(s)")) {
						conversion = val * 2.205;
						} else if(unitFrom.equals("Kilogram(s)") && unitTo.equals("Ounce(s)")) {
						conversion = val * 35.274;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Pound(s)
						if(unitFrom.equals("Pound(s)") && unitTo.equals("Pound(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Pound(s)") && unitTo.equals("Gram(s)")) {
						conversion = val * 453.6;
						} else if(unitFrom.equals("Pound(s)") && unitTo.equals("Milligram(s)")) {
						conversion = val * 453600;
						} else if(unitFrom.equals("Pound(s)") && unitTo.equals("Kilogram(s)")) {
						conversion = val / 2.205;
						} else if(unitFrom.equals("Pound(s)") && unitTo.equals("Ounce(s)")) {
						conversion = val * 16;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Ounce(s)
						if(unitFrom.equals("Ounce(s)") && unitTo.equals("Ounce(s)")) {
						conversion = val;
						} else if(unitFrom.equals("Ounce(s)") && unitTo.equals("Gram(s)")) {
						conversion = val * 28.35;
						} else if(unitFrom.equals("Ounce(s)") && unitTo.equals("Milligram(s)")) {
						conversion = val * 28350;
						} else if(unitFrom.equals("Ounce(s)") && unitTo.equals("Kilogram(s)")) {
						conversion = val / 35.274;
						} else if(unitFrom.equals("Ounce(s)") && unitTo.equals("Pound(s)")) {
						conversion = val / 16;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
						
//--------------------------------------------------------------------------------------------------
					//TEMPERATURE
					//Celsius
						if(unitFrom.equals("Celsius") && unitTo.equals("Celsius")) {
						conversion = val;
						} else if(unitFrom.equals("Celsius") && unitTo.equals("Fahrenheit")) {
						conversion = (val * 9 / 5) + 32;
						} else if(unitFrom.equals("Celsius") && unitTo.equals("Kelvin")) {
						conversion = val + 273.15;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Fahrenheit
						if(unitFrom.equals("Fahrenheit") && unitTo.equals("Fahrenheit")) {
						conversion = val;
						} else if(unitFrom.equals("Fahrenheit") && unitTo.equals("Celsius")) {
						conversion = (val - 32) * 5 / 9;
						} else if(unitFrom.equals("Fahrenheit") && unitTo.equals("Kelvin")) {
						conversion = (val - 32) * 5 / 9 + 273.15;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Kelvin
						if(unitFrom.equals("Kelvin") && unitTo.equals("Kelvin")) {
						conversion = val;
						} else if(unitFrom.equals("Kelvin") && unitTo.equals("Celsius")) {
						conversion = val - 273.15;
						} else if(unitFrom.equals("Kelvin") && unitTo.equals("Fahrenheit")) {
						conversion = (val - 273.15) * 9/5 + 32;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
						
//-------------------------------------------------------------------------------------------------------------------------
					//TIME
					//Millisecond(s)
						if(unitFrom.equals("Millisecond(s)") && unitTo.equals("Millisecond(s)")) {
						    conversion = val;
						} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Second(s)")) {
						    conversion = val / 1000;
						} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Minute(s)")) {
						    conversion = val / 60000;
						} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Hour(s)")) {
						    conversion = val / 3.6e+6;
						} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Day(s)")) {
						    conversion = val / 8.64e+7;
						} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Week(s)")) {
						    conversion = val / 6.048e+8;
						} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Month(s)")) {
						    conversion = val / 2.628e+9;
						} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Year(s)")) {
						    conversion = val / 3.154e+10;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
					
					//Second(s)
						if (unitFrom.equals("Second(s)") && unitTo.equals("Second(s)")) {
						    conversion = val;
						} else if (unitFrom.equals("Second(s)") && unitTo.equals("Millisecond(s)")) {
						    conversion = val * 1000;
						} else if (unitFrom.equals("Second(s)") && unitTo.equals("Minute(s)")) {
						    conversion = val / 60;
						} else if (unitFrom.equals("Second(s)") && unitTo.equals("Hour(s)")) {
						    conversion = val / 3600;
						} else if (unitFrom.equals("Second(s)") && unitTo.equals("Day(s)")) {
						    conversion = val / 86400;
						} else if (unitFrom.equals("Second(s)") && unitTo.equals("Week(s)")) {
						    conversion = val / 604800;
						} else if (unitFrom.equals("Second(s)") && unitTo.equals("Month(s)")) {
						    conversion = val / 2.628e+6;
						} else if (unitFrom.equals("Second(s)") && unitTo.equals("Year(s)")) {
						    conversion = val / 3.154e+7;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Minute(s)
						if (unitFrom.equals("Minute(s)") && unitTo.equals("Minute(s)")) {
						    conversion = val;
						} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Millisecond(s)")) {
						    conversion = val * 60000;
						} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Second(s)")) {
						    conversion = val * 60;
						} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Hour(s)")) {
						    conversion = val / 60;
						} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Day(s)")) {
						    conversion = val / 1440;
						} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Week(s)")) {
						    conversion = val / 10080;
						} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Month(s)")) {
						    conversion = val / 43800;
						} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Year(s)")) {
						    conversion = val / 525600;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Hour(s)
						if (unitFrom.equals("Hour(s)") && unitTo.equals("Hour(s)")) {
						    conversion = val;
						} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Millisecond(s)")) {
						    conversion = val * 3.6e+6;
						} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Second(s)")) {
						    conversion = val * 3600;
						} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Minute(s)")) {
						    conversion = val * 60;
						} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Day(s)")) {
						    conversion = val / 24;
						} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Week(s)")) {
						    conversion = val / 168;
						} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Month(s)")) {
						    conversion = val / 730;
						} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Year(s)")) {
						    conversion = val / 8760;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Day(s)
						if (unitFrom.equals("Day(s)") && unitTo.equals("Day(s)")) {
						    conversion = val;
						} else if (unitFrom.equals("Day(s)") && unitTo.equals("Millisecond(s)")) {
						    conversion = val * 8.64e+7;
						} else if (unitFrom.equals("Day(s)") && unitTo.equals("Second(s)")) {
						    conversion = val * 86400;
						} else if (unitFrom.equals("Day(s)") && unitTo.equals("Minute(s)")) {
						    conversion = val * 1440;
						} else if (unitFrom.equals("Day(s)") && unitTo.equals("Hour(s)")) {
						    conversion = val * 24;
						} else if (unitFrom.equals("Day(s)") && unitTo.equals("Week(s)")) {
						    conversion = val / 7;
						} else if (unitFrom.equals("Day(s)") && unitTo.equals("Month(s)")) {
						    conversion = val / 30.417;
						} else if (unitFrom.equals("Day(s)") && unitTo.equals("Year(s)")) {
						    conversion = val / 365;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Week(s)
						if (unitFrom.equals("Week(s)") && unitTo.equals("Week(s)")) {
						    conversion = val;
						} else if (unitFrom.equals("Week(s)") && unitTo.equals("Millisecond(s)")) {
						    conversion = val * 6.048e+8;
						} else if (unitFrom.equals("Week(s)") && unitTo.equals("Second(s)")) {
						    conversion = val * 604800;
						} else if (unitFrom.equals("Week(s)") && unitTo.equals("Minute(s)")) {
						    conversion = val * 10080;
						} else if (unitFrom.equals("Week(s)") && unitTo.equals("Hour(s)")) {
						    conversion = val * 168;
						} else if (unitFrom.equals("Week(s)") && unitTo.equals("Day(s)")) {
						    conversion = val * 7;
						} else if (unitFrom.equals("Week(s)") && unitTo.equals("Month(s)")) {
						    conversion = val / 4.345;
						} else if (unitFrom.equals("Week(s)") && unitTo.equals("Year(s)")) {
						    conversion = val / 52.143;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Month(s)
						if (unitFrom.equals("Month(s)") && unitTo.equals("Month(s)")) {
						    conversion = val;
						} else if (unitFrom.equals("Month(s)") && unitTo.equals("Millisecond(s)")) {
						    conversion = val * 2.628e+9;
						} else if (unitFrom.equals("Month(s)") && unitTo.equals("Second(s)")) {
						    conversion = val * 2.628e+6;
						} else if (unitFrom.equals("Month(s)") && unitTo.equals("Minute(s)")) {
						    conversion = val * 43800;
						} else if (unitFrom.equals("Month(s)") && unitTo.equals("Hour(s)")) {
						    conversion = val * 730;
						} else if (unitFrom.equals("Month(s)") && unitTo.equals("Day(s)")) {
						    conversion = val * 30.417;
						} else if (unitFrom.equals("Month(s)") && unitTo.equals("Week(s)")) {
						    conversion = val * 4.34524;
						} else if (unitFrom.equals("Month(s)") && unitTo.equals("Year(s)")) {
						    conversion = val / 12;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
						
					//Year(s)
						if (unitFrom.equals("Year(s)") && unitTo.equals("Year(s)")) {
						    conversion = val;
						} else if (unitFrom.equals("Year(s)") && unitTo.equals("Millisecond(s)")) {
						    conversion = val * 3.154e+10;
						} else if (unitFrom.equals("Year(s)") && unitTo.equals("Second(s)")) {
						    conversion = val * 3.154e+7;
						} else if (unitFrom.equals("Year(s)") && unitTo.equals("Minute(s)")) {
						    conversion = val * 525600;
						} else if (unitFrom.equals("Year(s)") && unitTo.equals("Hour(s)")) {
						    conversion = val * 8760;
						} else if (unitFrom.equals("Year(s)") && unitTo.equals("Day(s)")) {
						    conversion = val * 365;
						} else if (unitFrom.equals("Year(s)") && unitTo.equals("Week(s)")) {
						    conversion = val * 52.143;
						} else if (unitFrom.equals("Year(s)") && unitTo.equals("Month(s)")) {
						    conversion = val * 12;
						}
						
						tbUnitTo.setText(String.valueOf(conversion));
					
				}});
					
			}
					
}
