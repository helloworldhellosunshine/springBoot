package cn.zcbigdata.mybits_demo.service;

import cn.zcbigdata.mybits_demo.entity.Filepath;

import java.util.List;

public interface FilepathService {
    int insert(String path);

    List<Filepath> showFiles();
}
