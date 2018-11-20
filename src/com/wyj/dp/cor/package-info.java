/**
 * 责任链模式（chain of responsibility） cor
 *
 * 场景： 员工申请请假，不同的领导有不同的权限，比如说组长（GroupLeader）可以允许两天，经理（Manager）允许4天，
 *      部门领导（DepartmentHeader）允许7天，然后根据请假的天数自动交由不同的领导来处理。
 *
 * Created
 * Author: wyj
 * Date: 2018/11/20
 */
package com.wyj.dp.cor;