import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Введите текущую температуру (в C) - ");
    int t = scanner.nextInt();

    System.out.print("Введите скорость ветра (в м/c) - ");
    int w = scanner.nextInt();

    System.out.print("Идёт ли сейчас дождь? (1 - Да / 0 - Нет) ");
    int ri = scanner.nextInt();
    boolean r = (ri != 0);

    if (t > 27 || t < -15) {
      System.out.print("Температура не подходит для прогулки, лучше останьтесь дома и напишите программу на Java");
    } else if (t > 10 && w > 15) {
      if (r) {
        System.out.print("На улице тепло, но сильный ветер и дождь, пожалуйста, не забудьте защиту от ветра и зонт");
      } else {
        System.out.print("На улице тепло, но сильный ветер, пожалуйста, не забудьте защиту от ветра");
      }
    } else if (t < 10 && w > 15) {
      if (r) {
        System.out.print("На улице сильный холодный ветер, одевайтесь теплее");
      } else {
        System.out.print("На улице сильный холодный ветер и дождь, возможно стоит остаться дома");
      }
    } else if (t > 10 && w <= 15) {
      if (r) {
        System.out.print("На улице дождь, не забудьте зонт");
      } else {
        System.out.print("На улице хорошо, отличное время для прогулки!");
      }
    } else if (t < 10 && w <= 15) {
      if (r) {
        System.out.print("На улице безветренно, но прохладно и идёт дождь, возьмите зонт");
      } else {
        System.out.print("На улице прохладно, одевайтесь теплее");
      }
    }
    }
}
