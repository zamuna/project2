package ea.dao;


import ea.domain.Series;

import java.util.List;

/**
 * Created by Zamuna on 8/7/2017.
 */
public interface ISeriesDao {
    public abstract List<Series> getAll();

    public abstract void add(Series series);

    public abstract Series get(int id);

    public abstract void update(int seriesId, Series series);

    public abstract void delete(Series series);
}
