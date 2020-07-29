package com.wipro.videorentalsystem;

public class Video {
	String videoName;
	boolean checkout;
	int rating;
	Video(String name)
	{
		videoName=name;
	}
	public boolean getCheckout()
	{
		return checkout;
	}
	public String getVideoName() {
		return videoName;
	}
	public boolean isCheckout() {
		return checkout;
	}
	public int getRating() {
		return rating;
	}
	public void doCheckout()
	{
		System.err.println("Video "+'"'+ getName()+'"' +" checked out successfully.");
	}
	public String getName()
	{
		return videoName;
	}
	public void doReturn()
	{
		checkout=true;
		System.err.println("Video "+'"'+ getName()+'"' +" returned successfully.");
	}
	public void receiveRating(int rating)
	{
		this.rating=rating;
	}
}
