package mes.domain.dto.material;

import lombok.*;
import mes.domain.dto.member.MemberDto;
import mes.domain.entity.material.MaterialEntity;
import mes.domain.entity.material.MaterialInOutEntity;
import mes.domain.entity.member.AllowApprovalEntity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MaterialInOutDto {

    private int mat_in_outid;// -- 원자재 입출고 PK
    private int mat_in_type;// -- + -
    private int mat_st_stock;// -- 남은 재고
    private AllowApprovalEntity allowApprovalEntity;
    private MaterialEntity materialEntity;// -- 마스터 원자재 테이블 fk
    private int MatID; // 검색용
    private int mat_in_code;
    private int al_app_no;
    private MemberDto memberdto;
    // 승인 페이지에서 필요한 필드
    private String cdate;
    private String udate;




    public MaterialInOutDto(int mat_in_outid, int mat_in_type, int mat_st_stock, LocalDate cdate, LocalDate udate, AllowApprovalEntity allowApprovalEntity, MaterialEntity materialEntity) {
        this.mat_in_outid = mat_in_outid;
        this.mat_in_type = mat_in_type;
        this.mat_st_stock = mat_st_stock;
        this.cdate = cdate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.udate = udate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));;
        this.allowApprovalEntity = allowApprovalEntity;
        this.materialEntity = materialEntity;
    }

    public MaterialInOutEntity toInEntity(){
        return MaterialInOutEntity.builder()
                .mat_in_outid(this.mat_in_outid)
                .mat_st_stock(this.mat_st_stock)
                .mat_in_type(this.mat_in_type)
                .materialEntity(this.materialEntity)
                .allowApprovalEntity(this.allowApprovalEntity)
                .mat_in_code(this.mat_in_code)
                .memberEntity(this.memberdto.toEntity())
                .build();
    }
}
