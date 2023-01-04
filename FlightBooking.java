import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class FlightBooking extends Applet implements ActionListener {
  Label heading, nameLabel, sourceLabel, destinationLabel, dateLabel;
  TextField nameText, sourceText, destinationText, dateText;
  Button book;
 
  public void init() {
    heading = new Label("Flight Booking");
    nameLabel = new Label("Name:");
    sourceLabel = new Label("Source:");
    destinationLabel = new Label("Destination:");
    dateLabel = new Label("Date:");
    nameText = new TextField(20);
    sourceText = new TextField(20);
    destinationText = new TextField(20);
    dateText = new TextField(20);
    book = new Button("Book");
 
    add(heading);
    add(nameLabel);
    add(nameText);
    add(sourceLabel);
    add(sourceText);
    add(destinationLabel);
    add(destinationText);
    add(dateLabel);
    add(dateText);
    add(book);
 
    book.addActionListener(this);
  }
 
  public void actionPerformed(ActionEvent ae) {
    String name = nameText.getText();
    String source = sourceText.getText();
    String destination = destinationText.getText();
    String date = dateText.getText();
 
    Label bookingConfirmation = new Label("Booking confirmed for " + name + " from " + source + " to " + destination + " on " + date);
    add(bookingConfirmation);
 
    validate();
  }
}
