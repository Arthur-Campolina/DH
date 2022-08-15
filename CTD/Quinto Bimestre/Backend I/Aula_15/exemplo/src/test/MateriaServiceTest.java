package test;

import dao.ConfiguracaoJDBC;
import dao.Impl.MateriaDaoH2;
import model.Materia;
import org.junit.jupiter.api.Test;
import service.MateriaService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MateriaServiceTest {
    private MateriaService materiaService = new MateriaService(new MateriaDaoH2(new ConfiguracaoJDBC()));

    @Test
    public void salvarMateriaTest() {
        Materia materia = new Materia("Backend I");
        Materia materiaSalva = materiaService.salvar(materia);

        assertNotNull(materiaSalva.getId());
    }

    @Test
    public void buscarTodosTest() {
        Materia materia = new Materia("Backend I");
        materiaService.salvar(materia);

        List<Materia> materias = materiaService.buscarTodos();
        assertEquals(1, materias.size());
    }
}