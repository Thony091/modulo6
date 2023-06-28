package tech.awakelab.mvcprevention.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import tech.awakelab.mvcprevention.modelo.Capacitacion;

public class CapacitacionDAOImpl implements ICapacitacionDao {

	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Capacitacion> getAllTrainings() {

		String sql = "select id, rut_cliente, dia, hora, lugar, duracion , cantidad_asistentes from capacitaciones";

		return template.query(sql, new CapacitacionRowMapper());
	}

	@Override
	public void saveTrainings(Capacitacion capacitacion) {
		String sql = "insert capacitaciones (rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes) "
				+ "values(?,?,?,?,?,?)";
		template.update(sql, new Object[] { capacitacion.getRutCliente(), capacitacion.getDia(), capacitacion.getHora(),
				capacitacion.getLugar(), capacitacion.getDuracion(), capacitacion.getCantidadAsistentes() });
	}

	class CapacitacionRowMapper implements RowMapper<Capacitacion> {
		public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Capacitacion(rs.getInt("id"), rs.getString("rut_cliente"), rs.getString("dia"),
					rs.getString("hora"), rs.getString("lugar"), rs.getString("duracion"),
					rs.getInt("cantidad_asistentes"));
		}
	}

}
