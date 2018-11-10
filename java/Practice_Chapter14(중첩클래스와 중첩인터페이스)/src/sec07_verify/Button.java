package sec07_verify;

public class Button {

	interface OnClickListener{
		 void OnClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	void touch() {
		listener.OnClick();
	}
}
