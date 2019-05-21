package Chat03;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable{
  private BufferedReader console;
  private DataOutputStream dos;
  private Socket client;
  private boolean isRunning;
  public Send (Socket client){
      this.client = client;
      console = new BufferedReader(new InputStreamReader(System.in));
      this.isRunning = true;
      try {
          dos = new DataOutputStream(client.getOutputStream());
      } catch (IOException e) {
          System.out.println("==1==");
          this.release();

      }
  }

    public void run() {
        while (isRunning){
            String msg = getStrFromConsole();
            if (!msg.equals("")){
                System.out.println(msg);
            }
        }
  }
  //发送信息
    private void send(String msg){
        try {
            dos.writeUTF(msg);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("======3======");
            release();
        }
    }

  //从控制台获取信息
  private String getStrFromConsole(){
      try {
          return  console.readLine();
      } catch (IOException e) {
          e.printStackTrace();
      }
      return "";
  }

    private void release() {
        this.isRunning = false;
        Utils.close(dos,client);
    }
}

