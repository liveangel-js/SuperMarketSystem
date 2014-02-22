package data;

public class GiftEvent extends Record{

	private boolean birthDayGift;

	private int scoresGiftNum;
	
	public GiftEvent(String ID,boolean needDealed,int num){
		this.ID = ID;
		birthDayGift = needDealed;
		scoresGiftNum = num;
	}

	public boolean isBirthDayGift() {
		return birthDayGift;
	}
	public void setBirthDayGift(boolean birthDayGift) {
		this.birthDayGift = birthDayGift;
	}

	public int getScoresGiftNum() {
		return scoresGiftNum;
	}
	public void setScoresGiftNum(int scoresGiftNum) {
		scoresGiftNum = scoresGiftNum;
	}
	public String toString(){
		return ID+String.valueOf(birthDayGift)+","+scoresGiftNum;
	}
	public static Record toObject(String s){
		String []temp = s.split(",");
		return new GiftEvent(temp[0],Boolean.parseBoolean(temp[1]),Integer.parseInt(temp[2]));
	}
}
 