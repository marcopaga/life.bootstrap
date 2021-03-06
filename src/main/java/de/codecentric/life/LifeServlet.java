package de.codecentric.life;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet {
  private GameOfLife game = new GameOfLife();

  @Override
  protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    resp.addHeader("Refresh", "1");
    resp.getWriter().write(game.tick());
  }
}
