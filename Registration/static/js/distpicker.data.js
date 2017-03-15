/*!
 * Distpicker v1.0.4
 * https://github.com/fengyuanchen/distpicker
 *
 * Copyright (c) 2014-2016 Fengyuan Chen
 * Released under the MIT license
 *
 * Date: 2016-06-01T15:05:52.606Z
 */

(function (factory) {
    if (typeof define === 'function' && define.amd) {
        // AMD. Register as anonymous module.
        define('ChineseDistricts', [], factory);
    } else {
        // Browser globals.
        factory();
    }
})(function () {

    var ChineseDistricts = {
        86: {
            100100000: '农学院',
            100200000: '工程学院',
            100300000: '经济管理学院',
            100400000: '兽医学院',
            100500000: '园艺学院',
            100600000: '林学与风景园林学院 ',
            100700000: '资源环境学院 ',
            100800000: '生命科学学院',
            100900000: '动物科学学院',
            101000000: '食品学院',
            101100000: '人文与法学学院',
            101200000: '水利与土木工程学院',
            101300000: '数学与信息学院（软件学院）',
            101400000: '材料与能源学院',
            101500000: '电子工程学院',
            101600000: '公共管理学院',
            101700000: '艺术学院',
            101800000: '外国语学院',
        },
        100100000: {
            10010002: '农学',
            10010003: '种子科学与工程',
            10010004: '植物保护'
        },
        100200000: {
            10020007: '农业机械化及其自动化',
            10020008: '机械设计制造及其自动化',
            10020009: '交通运输',
            10020010: '工业设计',
            10020011: '电气工程及其自动化',
            10020012: '车辆工程',
            10020013: '自动化',
        },
        100300000: {

            10030016: '经济学',
            10030017: '金融学',
            10030018: '工商管理',
            10030019: '会计学',
            10030020: '市场营销',
            10030021: '国际经济与贸易',
            10030022: '电子商务',
            10030023: '人力资源管理',
            10030024: '物流管理',
        },
        100400000: {

            10040027: '动物药学',
            10040028: '动物医学',
        },
        100500000: {

            10050031: '园艺',
            10050033: '茶学',
            10050034: '设施农业科学与工程',
        },
        100600000: {

            10060037: '林学',
            10060038: '园林',
            10060039: '森林保护',
            10060040: '城乡规划',
            10060041: '旅游管理',
            10060042: '风景园林',
            10060043: '草业科学',
        },
        100700000: {

            10060037: '林学',
            10060038: '园林',
            10060039: '森林保护',
            10060040: '城乡规划',
            10060041: '旅游管理',
            10060042: '风景园林',
            10060043: '草业科学',
        },
        100800000: {

            10080054: '生物科学',
            10080055: '生物技术',
        },
        100900000: {

            10090058: '蚕学',
            10090059: '动物科学',
            10090060: '水产养殖学',
        },
        101000000: {

            10100063: '食品科学与工程',
            10100064: '生物工程',
            10100065: '包装工程',
            10100066: '食品质量与安全',
        },
        101100000: {

            10110069: '法学',
            10110070: '汉语言文学',
            10110071: '历史学',
            10110072: '哲学',
        },
        101200000: {

            10120075: '土木工程',
            10120076: '水利水电工程',
            10120077: '建筑学',
        },
        101300000: {

            10130083: '信息与计算科学',
            10130084: '数学与应用数学',
            10130085: '统计学',
            10130086: '应用统计学',
            10130087: '计算机科学与技术',
            10130088: '信息管理与信息系统',
            10130089: '网络工程',
            10130090: '软件工程',
            10130091: '工业工程',
            10130092: '教育技术学',
        },
        101400000: {

            10140095: '能源与环境系统工程',
            10140096: '应用化学',
            10140097: '材料化学',
            10140098: '材料科学与工程',
            10140099: '木材科学与工程',
            10140100: '制药工程',
        },
        101500000: {

            10150103: '电子信息工程',
            10150104: '电子科学与技术',
            10150105: '通信工程',
            10150106: '光电信息科学与工程',
            10150107: '电子信息科学与技术',
        },
        101600000: {

            10160110: '社会工作',
            10160111: '土地资源管理',
            10160112: '公共事业管理',
            10160113: '行政管理',
            10160114: '社会学',
            10160115: '劳动与社会保障',
            10160116: '房地产开发与管理',
        },
        101700000: {

            10170119: '服装设计与工程',
            10170120: '视觉传达设计',
            10170121: '环境设计',
            10170122: '产品设计',
            10170123: '服装与服饰设计',
            10170124: '动画',
            10170125: '音乐学',
            10170126: '表演',
            10170127: '广播电视编导',
        },
        101800000: {

            10180130: '英语',
            10180131: '日语',
            10180132: '商务英语',
        }
    }

    if (typeof window !== 'undefined') {
        window.ChineseDistricts = ChineseDistricts;
    }

    return ChineseDistricts;

});