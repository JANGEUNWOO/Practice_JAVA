package sec07_exam_button_event;

public class Button {


		   //��ø�������̽�
			interface OnclickListenner{
				void OnClick();
			}
			
			//�������̽� ������������
			OnclickListenner listener;
			
			//setter--�Ű������� �������̽� Ÿ���� ����Ǿ��ٸ� ���� �ǹ��ΰ�?
			void setOnClickListenner(OnclickListenner listener) {  
				this.listener = listener;
			}
			
			//touch()�޼��尡 ȣ�ߵ��鼭 ��ø�������̽��� ������ ��ü�� 
			//OnClick()�޼��尡 �����.
			
			void touch() {
				listener.OnClick();
			}
			
			
	}
	

