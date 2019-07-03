package com.atpingan;

import java.io.UnsupportedEncodingException;


public class CharacterDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
//		String tString = "&#124";
//		String hv = null;
//		StringBuffer stringBuffer1 = new StringBuffer();
//		byte[] bytes2 = tString.getBytes("gbk");
//		for (int i = 0; i < bytes2.length; i++) {
//			int v = bytes2[i] & 0xFF;
//			 hv = Integer.toHexString(v);
//		}
//		
//		
//		
//		String string = stringBuffer1.append(hv).toString();
//		System.out.println(string + "----");
//		

		String ss = "河北省任丘市鄚州镇李广二村740号"; // 26233132343b
		String tos = null;

		try {
			StringBuffer stringBuffer = new StringBuffer();
			byte[] bytes = ss.getBytes("GBK");
			for (int i = 0; i < bytes.length; i++) {
				int v = bytes[i] & 0xFF;
				String hva = Integer.toHexString(v);
				if (hva.length() < 2) {
					stringBuffer.append(0);
				}else {
					stringBuffer.append(hva);
				}
			}
			
			tos = stringBuffer.toString();
			System.out.println(tos);
			if(tos.contains("7c")) {
				tos = tos.replaceAll("7c", "26233132343b");
			}
			
			System.out.println(tos);
			
			
			
			String s_gbk = new String("鄚".getBytes("gbk"), "iso-8859-1");
			System.out.println(s_gbk);

			String s_gbk1 = new String(s_gbk.getBytes("iso-8859-1"),"gbk");
			System.out.println(s_gbk1);
			
			
			System.out.println(new String("&#124;".getBytes("gbk"), "iso-8859-1"));
			
			String s_gbks = new String("河北省任丘市鄚州镇李广二村740号".getBytes("gbk"), "iso-8859-1");
			s_gbks = s_gbks.replace("|", "&#124;");
			System.out.println(s_gbks);

			String s_gbk2 = new String(s_gbks.getBytes("iso-8859-1"),"gbk");
			
			System.out.println(s_gbk2);
			
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
