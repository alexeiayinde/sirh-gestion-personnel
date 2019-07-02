package dev.sgp.filtre;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

public class FrequentationFilter implements Filter {
    private FilterConfig config = null;
    private VisiteWebService visiteService = Constantes.VISITE_SERVICE;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        config.getServletContext().log("FrequentationFilter initialized");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        int before = (int) System.currentTimeMillis();
        chain.doFilter(request, response);
        int after = (int) System.currentTimeMillis();

        String path = ((HttpServletRequest) request).getServletPath();
        VisiteWeb visite = new VisiteWeb(path, after - before);

        visiteService.sauvegarderChemin(path);
        visiteService.sauvegarderVisite(visite);

    }

    @Override
    public void destroy() {

    }

}
