package com.chainsys.employeeapp.util;

import java.io.IOException;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMailForBloodNeed {
	public static void send(final String from, final String password, String to, String sub, String blood,
			String hospitalname, String patientname, String disease, long contact, String location) throws IOException {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(sub);
			BodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("Urgent Blood Needed \n ");

			BodyPart messageBodyPart2 = new MimeBodyPart();
			messageBodyPart2.setText("\n\t\t Emergency \n \t\t ");
			BodyPart messageBodyPart3 = new MimeBodyPart();
			messageBodyPart3.setText("\n\t\t " + blood + " Blood Needed at  " + hospitalname + " Hospital");
			BodyPart messageBodyPart4 = new MimeBodyPart();
			messageBodyPart4.setText("\n\t\tplease if you are of that type or know Someone who is, ");
			BodyPart messageBodyPart5 = new MimeBodyPart();
			messageBodyPart5
					.setText("\n\t\t Name of patient: " + patientname + " \n\t\tpatient Diagnosis: " + disease + " ");
			BodyPart messageBodyPart6 = new MimeBodyPart();
			messageBodyPart6.setText("\n\t\t contact : " + contact);
			BodyPart messageBodyPart7 = new MimeBodyPart();
			messageBodyPart7.setText("\n\t\t Address : " + location + " ");
			/*
			 * /* String filename = "SendAttachment.java"; FileDataSource source = new
			 * FileDataSource(
			 * "C:\\Users\\kuma2416\\eclipse-workspace\\management\\src\\main\\java\\com\\employee\\buddaymail\\Budday.java"
			 * ); messageBodyPart2.setDataHandler(new DataHandler(source));
			 * messageBodyPart2.setFileName(filename);
			 */
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart2);
			multipart.addBodyPart(messageBodyPart3);
			multipart.addBodyPart(messageBodyPart4);
			multipart.addBodyPart(messageBodyPart5);
			multipart.addBodyPart(messageBodyPart6);
			multipart.addBodyPart(messageBodyPart7);

			message.setContent(multipart);
			Transport.send(message);
			System.out.println("Message sended");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
