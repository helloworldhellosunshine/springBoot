package cn.zcbigdata.mybits_demo.mapper;


import cn.zcbigdata.mybits_demo.entity.Filepath;

import java.util.List;

public interface FilepathMapper {
    int insert(String path);

    List<Filepath> showFiles();
}