package com.charles.util;

import java.util.ArrayList;
import java.util.List;

import org.sword.wechat4j.event.EventType;
import org.sword.wechat4j.menu.Menu;
import org.sword.wechat4j.menu.MenuButton;
import org.sword.wechat4j.menu.MenuManager;

public class MenuUtil {
	private MenuManager menuManager = new MenuManager();

	public MenuManager getMenuManager() {
		return menuManager;
	}

	public void setMenuManager(MenuManager menuManager) {
		this.menuManager = menuManager;
	}
	 /**
     * 创建菜单
     * @throws Exception
     */
    public void createMenu() throws Exception {
        Menu menu = new Menu();
 
        List<MenuButton> buttons = new ArrayList<MenuButton>();
        buttons.add(createbutton1());
        buttons.add(createbutton2());
//        buttons.add(createbutton3());
        menu.setButton(buttons);
//        System.out.println(JSON.toJSONString(menu));
        menuManager.create(menu);
    }
     
    /**
     * 删除菜单
     * @throws Exception
     */
    public void deleteMenu() throws Exception {
        menuManager.delete();
    }
     
    /**
     * 列出菜单
     * @throws Exception
     */
    public void queryMenu() throws Exception {
        Menu menu = menuManager.getMenu();
        List<MenuButton> list = menu.getButton();
        for(MenuButton mb:list) {
            List<MenuButton> subbuttons = mb.getSubButton();
            System.out.println(subbuttons.get(0).getName());
        }
    }
 
    /**
     * 创建第一个菜单项
     *
     * @return
     */
    public MenuButton createbutton1() {
        MenuButton menuButton = new MenuButton();
        menuButton.setName("菜单1");
 
        MenuButton mb1 = new MenuButton();
        mb1.setType(EventType.view);
        mb1.setName("百度搜索");
        mb1.setUrl("http://www.baidu.com");
 
        MenuButton mb2 = new MenuButton();
        mb2.setType(EventType.view);
        mb2.setName("搜狗搜索");
        mb2.setUrl("http://www.sogou.com");
        
        MenuButton mb3 = new MenuButton();
        mb3.setType(EventType.click);
        mb3.setName("赞我们");
        mb3.setKey("V1001_TODAY_LIKE");
 
        List<MenuButton> buttons = new ArrayList<MenuButton>();
        buttons.add(mb1);
        buttons.add(mb2);
        buttons.add(mb3);
        
        menuButton.setSubButton(buttons);
        return menuButton;
    }
 
    /**
     * 创建第二个菜单
     *
     * @return
     * @throws Exception
     */
    public MenuButton createbutton2() throws Exception {
        MenuButton menuButton = new MenuButton();
        menuButton.setName("菜单2");
 
        MenuButton mb1 = new MenuButton();
        mb1.setType(EventType.scancode_push);
        mb1.setName("扫一扫");
        mb1.setKey("rselfmenu_0_0");
        
        MenuButton mb2 = new MenuButton();
        mb2.setType(EventType.location_select);
        mb2.setName("输入地址");
        mb2.setKey("rselfmenu_0_1");
        
        List<MenuButton> buttons = new ArrayList<MenuButton>();
        buttons.add(mb1);
        buttons.add(mb2);
 
        menuButton.setSubButton(buttons);
        return menuButton;
    }
 
    public static void main(String[] args) throws Exception {
        MenuUtil menuUtil = new MenuUtil();
//        menuUtil.createMenu();
//      menuUtil.deleteMenu();
      menuUtil.queryMenu();
    }
}