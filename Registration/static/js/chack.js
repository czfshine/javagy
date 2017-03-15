 $(document).ready(function () {
     // Generate a simple captcha
     function randomNumber(min, max) {
         return Math.floor(Math.random() * (max - min + 1) + min);
     };
     $('#captchaOperation').html([randomNumber(1, 100), '+', randomNumber(1, 200), '='].join(' '));

     $('#defaultForm').bootstrapValidator({
         //        live: 'disabled',
         message: '这个值是必填的',
         feedbackIcons: {
             valid: 'glyphicon glyphicon-ok',
             invalid: 'glyphicon glyphicon-remove',
             validating: 'glyphicon glyphicon-refresh'
         },
         fields: {
             team_name: {
                 message: '团队名是必须的',
                 validators: {
                     notEmpty: {
                         message: '团队名不能为空'
                     },
                     stringLength: {
                         min: 2,
                         max: 10,
                         message: '在二到十个汉字之间'
                     }

                 }
             },
             team_type: {
                 validators: {
                     notEmpty: {
                         message: '团队类型不能为空'
                     }
                 }
             },
             master_name: {
                 message: '负责人是必须的',
                 validators: {
                     notEmpty: {
                         message: '负责人不能为空'
                     },
                     stringLength: {
                         min: 2,
                         max: 6,
                         message: '在二到六个汉字之间'
                     }

                 }
             },
             master_id: {
                 message: '学号是必须的',
                 validators: {
                     notEmpty: {
                         message: '学号不能为空'
                     },
                     stringLength: {
                         min: 12,
                         max: 12,
                         message: '12位学号'
                     },
                     regexp: {
                         regexp: /^[0-9]+$/,
                         message: '只能由数字组成'
                     }
                 }
             },
             master_phone: {
                 message: '联系方式是必须的',
                 validators: {
                     notEmpty: {
                         message: '联系方式不能为空'
                     },
                     stringLength: {
                         min: 6,
                         max: 11,
                         message: '6位短号或11位长号'
                     },
                     regexp: {
                         regexp: /^[0-9]+$/,
                         message: '只能由数字组成'
                     }
                 }
             },

             master_qq: {
                 message: '请留下qq或者微信号',
                 validators: {
                     notEmpty: {
                         message: 'qq或者微信号不能为空'
                     }

                 }
             },

             master_email: {
                 validators: {
                     notEmpty: {
                         message: '邮箱不能为空'
                     },

                     emailAddress: {
                         message: '请输入正确的邮箱'
                     }
                 }
             }
         }
     });

     // Validate the form manually
     $('#validateBtn').click(function () {
         $('#defaultForm').bootstrapValidator('validate');
     });

     $('#resetBtn').click(function () {
         $('#defaultForm').data('bootstrapValidator').resetForm(true);
     });
 });
